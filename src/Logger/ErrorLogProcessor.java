package Logger;

public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int loglevel, String message){
        if(loglevel == ERROR){
            System.out.println(message);
        }else {
            super.log(loglevel, message);
        }
    }
}
