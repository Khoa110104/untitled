package oop.lab.lab11.factorymethod.pseudocode;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
