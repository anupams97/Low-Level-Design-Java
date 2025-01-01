package UILibrary.AbstractFactoryPattern;


import UILibrary.AbstractFactoryPattern.Button.Button;
import UILibrary.AbstractFactoryPattern.Button.LightModeButton;
import UILibrary.AbstractFactoryPattern.Checkbox.Checkbox;
import UILibrary.AbstractFactoryPattern.Checkbox.LightModeCheckBox;

public class LightModeFactory extends UIFactory{
    @Override
    public Checkbox createCheckBox() {
        return new LightModeCheckBox();
    }

    @Override
    public Button createButton() {
        return new LightModeButton();
    }
}
