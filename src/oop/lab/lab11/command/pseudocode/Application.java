package oop.lab.lab11.command.pseudocode;

public class Application {
    public String clipboard = "";
    public Editor[] editors;
    public Editor activeEditor;
    public CommandHistory history;

    private Button copyButton;
    private Button cutButton;
    private Button pasteButton;
    private Button undoButton;
    private Shortcut shortcuts;


    public static void main(String[] args) {
        Application app = new Application();
        app.createUI();

        System.out.println("----------------EDITOR1----------------");
        System.out.println("Clipboard first: " + app.clipboard);
        System.out.println("Selection first editor1: " + app.activeEditor.getSelection());
        app.activeEditor.replaceSelection("hello");
        System.out.println("Selection editor1 after when select (hello): " + app.activeEditor.getSelection());
        app.copyButton.onClick();
        System.out.println("Clipboard after when press (copy): " + app.clipboard);

        app.activeEditor = app.editors[1];
        System.out.println("----------------NEXT EDITOR2-------------------");
        System.out.println("Selection first editor2: " + app.activeEditor.getSelection());
        app.pasteButton.onClick();
        System.out.println("Selection editor2 after when press (paste): " + app.activeEditor.getSelection());
        app.cutButton.onClick();
        System.out.println("Selection editor2 after when press (cut): " + app.activeEditor.getSelection());
        app.undoButton.onClick();
        System.out.println("Selection editor2 after when press (undo): " + app.activeEditor.getSelection());
        app.undoButton.onClick();
        System.out.println("Selection editor2 after when press (undo): " + app.activeEditor.getSelection());
        app.activeEditor.replaceSelection("bye");
        System.out.println("Selection editor2 after when select (bye): " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+C");
        System.out.println("Clipboard after pressing combination (Ctrl+C): " + app.clipboard);

        app.activeEditor = app.editors[2];
        System.out.println("----------------NEXT EDITOR3-------------------");
        System.out.println("Selection first editor3: " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+V");
        System.out.println("Selection editor3 after pressing combination (Ctrl+V): " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+X");
        System.out.println("Selection editor3 after pressing combination (Ctrl+X): " + app.activeEditor.getSelection());
        app.shortcuts.onPress("Ctrl+Z");
        System.out.println("Selection editor3 after pressing combination (Ctrl+Z): " + app.activeEditor.getSelection());
        System.out.println("---------------------------END-----------------------------");
    }

    public void createUI() {
        copyButton = new Button();
        cutButton = new Button();
        pasteButton = new Button();
        undoButton = new Button();
        shortcuts = new Shortcut();
        history = new CommandHistory();

        editors = new Editor[]{new Editor(), new Editor(), new Editor()};
        activeEditor = editors[0];


        Action copy = () -> executeCommand(new CopyCommand(this, activeEditor));
        copyButton.setCommand(copy);
        shortcuts.onKeyPress("Ctrl+C", copy);

        Action cut = () -> executeCommand(new CutCommand(this, activeEditor));
        cutButton.setCommand(cut);
        shortcuts.onKeyPress("Ctrl+X", cut);

        Action paste = () -> executeCommand(new PasteCommand(this, activeEditor));
        pasteButton.setCommand(paste);
        shortcuts.onKeyPress("Ctrl+V", paste);

        Action undo = () -> executeCommand(new UndoCommand(this, activeEditor));
        undoButton.setCommand(undo);
        shortcuts.onKeyPress("Ctrl+Z", undo);
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
