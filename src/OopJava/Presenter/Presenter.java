package OopJava.Presenter;

import OopJava.Service.Service;
import OopJava.UI.View;

import java.time.LocalDate;
import java.util.List;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addHuman(List<String> human) {
        service.addHuman(human.get(0), LocalDate.parse(human.get(1)));
    }

    public void removeHuman(int id) {
        if (service.removeHuman(id)) {
            view.print("Данные удалены");
        }
        else {
            view.print("Удаление по этому ID невозможно");
        }
    }
    public void searchHuman(String lastName) {
        view.print(service.searchHuman(lastName).toString());
    }

    public void saveToFile(String nameToFile) {
        service.saveFamily(nameToFile);
        view.print("Сохранено");
    }

    public void loadFromFile(String nameFile) {
        service.loadFamily(nameFile);
        view.print("Загружено");
    }

    public void showTree() {
        view.print(service.getFamily().toString());
    }
}