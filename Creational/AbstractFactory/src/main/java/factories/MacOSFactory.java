package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.CheckBox;
import checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
