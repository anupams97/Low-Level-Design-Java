package SingletonPattern;

public class DBConnection {
    private static DBConnection  conObj;
    private void DBconnection(){
    }
    public static DBConnection getInstance(){
        if (conObj == null){
            synchronized (DBConnection.class){
                if (conObj == null) {
                    conObj = new DBConnection();
                }
                }
            }
        return conObj;
        }
    }


