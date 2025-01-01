package HeadFirstDesignPatterns.CommandPattern;

import java.util.Stack;

public class Remote {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undo;
    Remote(){
        onCommands =new Command[7];
        offCommands =new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undo = new Stack<>();
    }
    public void setCommand(int slot, Command onCommand,Command offCommand){
        onCommands[slot]= onCommand;
        offCommands[slot]= offCommand;
    }
    public void buttonOnPressed(int slot){
        onCommands[slot].execute();
        undo.push(onCommands[slot]);
    }
    public void buttonOffPressed(int slot){
        offCommands[slot].execute();
        undo.push(offCommands[slot]);
    }
    public void buttonUndoPressed() {
        if (!undo.isEmpty()) { // Check if the stack is not empty
            Command prev = undo.pop(); // Safely pop the top command
            prev.undo(); // Perform the undo operation
        } else {
            System.out.println("Nothing to undo"); // Inform the user when there's nothing to undo
        }
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n----------------Remote----------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "   " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return sb.toString();
    }

}
