package ObjectPoolPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseConnectionPool pool = new DatabaseConnectionPool(3);
        DatabaseConnection conn1 = pool.getFromPool();
        conn1.connect();
        DatabaseConnection conn2 = pool.getFromPool();
        conn2.connect();
        DatabaseConnection conn3 = pool.getFromPool();
        conn3.connect();

        pool.returnToPool(conn1);
        pool.returnToPool(conn2);
        System.out.println("Total Objects Created: " + pool.getTotalObjectsCreated());
        System.out.println("Objects In Use: " + pool.getObjectsInUse());
        System.out.println("Idle Objects: " + pool.getIdleObjects());



        // Print metrics again
        System.out.println("Total Objects Created: " + pool.getTotalObjectsCreated());
        System.out.println("Objects In Use: " + pool.getObjectsInUse());
        System.out.println("Idle Objects: " + pool.getIdleObjects());
    }
}
