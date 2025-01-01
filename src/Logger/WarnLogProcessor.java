package Logger;

public class WarnLogProcessor extends LogProcessor {
    WarnLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int loglevel, String message){
        if(loglevel == WARN){
            System.out.println(message);
        }else {
            super.log(loglevel, message);
        }
    }
}
