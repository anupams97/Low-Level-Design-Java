package UILibrary.AbstractFactoryPattern;

import UILibrary.AbstractFactoryPattern.Button.Button;
import UILibrary.AbstractFactoryPattern.Checkbox.Checkbox;

public abstract class UIFactory {
    public abstract Checkbox createCheckBox();
    public abstract Button createButton();

}
