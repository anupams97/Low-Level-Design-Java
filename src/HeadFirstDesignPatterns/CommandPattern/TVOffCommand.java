package HeadFirstDesignPatterns.CommandPattern;

public class TVOffCommand implements Command{
    TV tv;
    TVOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
    public void undo() {
        tv.on();
    }
}
