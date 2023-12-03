package oop.lab.lab11.abstractfactory.pseudocode;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String configOS = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;
        if (configOS.contains("win")) {
            factory = new WinFactory();
        } else if (configOS.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}

