package UILibrary.AbstractFactoryPattern;

import UILibrary.AbstractFactoryPattern.Button.Button;
import UILibrary.AbstractFactoryPattern.Button.DarkModeButton;
import UILibrary.AbstractFactoryPattern.Checkbox.Checkbox;
import UILibrary.AbstractFactoryPattern.Checkbox.DarkModeCheckbox;

public class DarkModeFactory extends UIFactory{
    @Override
    public Checkbox createCheckBox() {
        return new DarkModeCheckbox();
    }

    @Override
    public Button createButton() {
        return new DarkModeButton();
    }
}
