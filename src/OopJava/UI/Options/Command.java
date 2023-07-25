package OopJava.UI.Options;

import OopJava.Service.Service;
import OopJava.UI.Console;
import OopJava.UI.Options.Option;

public abstract class Command implements Option {

    private Console console;
    private Service service;

    public Command(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }
}