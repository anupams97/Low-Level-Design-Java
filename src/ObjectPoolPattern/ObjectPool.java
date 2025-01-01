package ObjectPoolPattern;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ObjectPool <T>{
    //TODO why did we use private final ?
    private final Queue<T> inUse = new ConcurrentLinkedQueue<>();
    private final Queue<T> free = new ConcurrentLinkedQueue<>();
    // TODO what is reentrant lock ?
    private final ReentrantLock lock = new ReentrantLock();
    protected abstract T createNewObject();
    private final int MaxPoolSize;
    private int totalObjectsCreated;

    ObjectPool(int size){
        this.MaxPoolSize = size;
        totalObjectsCreated= 0;
    }
    public void addToPool(T obj){
        lock.lock();
        try{
            if(free.size()+inUse.size()>=MaxPoolSize){
                throw new IllegalStateException("Pool is full");
            }
            free.add(obj);
        }finally{
            lock.unlock();
        }
    }
    public T getFromPool(){
        lock.lock();
        try{
            if(free.isEmpty()){
                if(free.size()+inUse.size()<MaxPoolSize){
                    T obj = createNewObject();
                    totalObjectsCreated++;
                    inUse.add(obj);
                    return obj;
                }else{
                    throw new IllegalStateException("All objects busy");
                }
            }else {
                T obj = free.remove();
                inUse.add(obj);
                return obj;
            }
        }
        finally{
            lock.unlock();
        }
    }
    public void returnToPool(T obj){
        lock.lock();
        try{
            if(!inUse.remove(obj)){
                throw new IllegalStateException("Object not part of the pool");
            }//should use a set instead than we can do containsKey
            reset(obj);
            free.add(obj);
        }finally{
            lock.unlock();
        }
    }
    // Metrics methods
    public int getTotalObjectsCreated() {
        return totalObjectsCreated;
    }

    public int getObjectsInUse() {
        return inUse.size();
    }

    public int getIdleObjects() {
        return free.size();
    }
    // Reset or disconnect the object (override this in subclasses as needed)
    protected void reset(T obj) {
        // Default implementation: do nothing
        // Subclasses like DatabaseConnectionPool can override to implement specific reset logic
    }
}
