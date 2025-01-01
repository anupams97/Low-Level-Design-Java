package Logger;

public abstract class  LogProcessor {
    public static int INFO = 0;
    public static int WARN = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;
    LogProcessor nextProcessor;

    LogProcessor( LogProcessor nextLogProcessor) {
        this.nextProcessor = nextLogProcessor;
    }
    public void log(int loglevel, String message){
        if(nextProcessor != null){
           nextProcessor.log(loglevel, message);
        }
    }
}
