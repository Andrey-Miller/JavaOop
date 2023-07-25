package OopJava.UI.Options;

import OopJava.UI.Console;

public class FileLoad extends Command {
    public FileLoad(Console console) {
        super(console);
    }
    @Override
    public String description() {
        return "Выгрузка из файла";
    }
    @Override
    public void execute(){
        getConsole().loadFromFile();
    }

}