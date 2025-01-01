package HeadFirstDesignPatterns.CommandPattern;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();

        Light light = new Light();
        LightOnCommand  lightOnCommand= new LightOnCommand(light);
        LightOffCommand  lightOffCommand= new LightOffCommand(light);
        remote.setCommand(0,lightOnCommand,lightOffCommand);

        TV tv = new TV();
        TVOnCommand  tvOnCommand  = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        remote.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println(remote);
        remote.buttonOnPressed(1);
        remote.buttonOffPressed(1);
        remote.buttonOnPressed(1);

        remote.buttonOnPressed(0);
        remote.buttonOffPressed(0);
        remote.buttonOnPressed(0);
        remote.buttonOnPressed(0);
        for(int i=0;i<10;i++){
            remote.buttonUndoPressed();
        }
        Command[] partyOn = {lightOffCommand,tvOnCommand};
        Command[] partyOff = {tvOffCommand,lightOnCommand};
        MacroCommand partyOnCommands = new MacroCommand(partyOn);
        MacroCommand partyOffCommands = new MacroCommand(partyOff);
        remote.setCommand(2,partyOnCommands,partyOffCommands);
        remote.buttonOnPressed(2);
        remote.buttonOffPressed(2);

    }
}
