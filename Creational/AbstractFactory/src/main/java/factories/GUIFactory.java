package factories;

import buttons.Button;
import checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
