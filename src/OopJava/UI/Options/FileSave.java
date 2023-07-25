package OopJava.UI.Options;

import OopJava.UI.Console;

public class FileSave extends Command{
    public FileSave(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Выгрузка в файл";
    }
    @Override
    public void execute() {
        getConsole().saveToFile();
    }
}