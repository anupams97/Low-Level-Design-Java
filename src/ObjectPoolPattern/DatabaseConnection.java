package ObjectPoolPattern;

public class DatabaseConnection {
    String connection;

    DatabaseConnection(String connection){
        this.connection = connection;
    }
    public void connect(){
        System.out.println("connected to "+ connection);
    }
    public void disconnect(){
        System.out.println("disconnected from "+ connection);
    }
}
