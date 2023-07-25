package OopJava.UI.Options;

import OopJava.UI.Console;

public class FindHuman extends Command {
    public FindHuman(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск по имени";
    }

    @Override
    public void execute() {getConsole().searchHuman();
    }
}