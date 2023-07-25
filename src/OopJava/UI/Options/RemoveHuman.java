package OopJava.UI.Options;

import OopJava.UI.Console;

public class RemoveHuman extends Command {
    public RemoveHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить человека";
    }

    @Override
    public void execute(){
        getConsole().removeHuman();
    }
}