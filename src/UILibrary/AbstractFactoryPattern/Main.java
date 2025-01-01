package UILibrary.AbstractFactoryPattern;

import UILibrary.AbstractFactoryPattern.Button.Button;
import UILibrary.AbstractFactoryPattern.Checkbox.Checkbox;

public class Main {
    public static void main(String[] args) {
        UIFactory lightUI = new LightModeFactory();
        Button dButton = lightUI.createButton();
        Checkbox dCheckbox = lightUI.createCheckBox();
        dButton.display();
        dCheckbox.display();
        UIFactory darkUI = new DarkModeFactory();
        Button lButton = darkUI.createButton();
        Checkbox lCheckbox = darkUI.createCheckBox();
        lButton.display();
        lCheckbox.display();


    }
}
