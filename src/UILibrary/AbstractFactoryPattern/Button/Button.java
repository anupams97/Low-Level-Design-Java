package UILibrary.AbstractFactoryPattern.Button;

public abstract class Button {
    String name;
    String backgroundColor;
    String textColor;
    boolean isClicked;
    public void display() {
        System.out.println("Rendering a " + name +" Button with "+ backgroundColor +" background and " + textColor + " text.");
    }
}
