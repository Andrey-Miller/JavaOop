package OopJava;

import OopJava.Tree.FamilyTree;
import OopJava.Presenter.Presenter;
import OopJava.Service.Service;
import OopJava.UI.Console;
import OopJava.UI.View;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree test = new FamilyTree();
        Service service = new Service(test);
        View view = new Console();
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}