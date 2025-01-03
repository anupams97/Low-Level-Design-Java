package HeadFirstDesignPatterns.CommandPattern;

public class LightOffCommand implements Command{
    Light light;
    LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
    public void undo() {
        light.on();
    }
}
