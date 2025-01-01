package HeadFirstDesignPatterns.CommandPattern;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("I do nothing");
    }
    public void undo() {
        System.out.println("I do nothing");
    }
}
