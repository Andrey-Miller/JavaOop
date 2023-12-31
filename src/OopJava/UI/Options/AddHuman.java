package OopJava.UI.Options;

import OopJava.UI.Console;

public class AddHuman extends Command {
    public AddHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить человека";
    }

    @Override
    public void execute() {
        getConsole().addHuman();
    }
}