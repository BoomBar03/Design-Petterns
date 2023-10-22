package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.CheckBox;
import checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
