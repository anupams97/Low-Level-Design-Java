package UILibrary.AbstractFactoryPattern.Checkbox;

public abstract class Checkbox {
    String name;
    String backgroundColor;
    String textColor;
    boolean isChecked;
    Checkbox(){

    }

    public void display() {
        System.out.println("Rendering a " + name + " Checkbox with " + backgroundColor + " background and " + textColor + " tick.");
    }
}
