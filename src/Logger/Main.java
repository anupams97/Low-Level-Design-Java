package Logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.INFO, "this is info log");
        logger.log(LogProcessor.ERROR, "this is error log");
        logger.log(LogProcessor.DEBUG, "this is debug log");
    }
}
