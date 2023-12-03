package oop.lab.lab11.abstractfactory.pseudocode;

public class Application {
    private Button button;
    private Checkbox checkbox;
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

