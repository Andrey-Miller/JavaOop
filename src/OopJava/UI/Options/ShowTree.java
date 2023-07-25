package OopJava.UI.Options;

import OopJava.UI.Console;

public class ShowTree extends Command {
    public ShowTree(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Вывести список людей";
    }
    @Override
    public void execute() { getConsole().showTree();
    }

}