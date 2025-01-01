package ObjectPoolPattern;

public class DatabaseConnectionPool extends ObjectPool<DatabaseConnection>{
    private int connectionCounter = 0;
    DatabaseConnectionPool(int size) {
        super(size);
    }

    @Override
    protected DatabaseConnection createNewObject() {
        connectionCounter++;
        return new DatabaseConnection("new connection "+connectionCounter);
    }
    @Override
    protected void reset(DatabaseConnection connection) {
        connection.disconnect(); // Disconnect the connection before returning it to the pool
    }
}
