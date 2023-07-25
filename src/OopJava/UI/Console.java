package OopJava.UI;

import OopJava.Presenter.Presenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    @Override
    public void start() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
        while (work){
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)){
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("что-то пошло не так");
            }
        }
    }

    private boolean checkInput(String text){
        return text.matches("[0-9]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String text){
        System.out.println(text);
    }

    public void finish(){
        work = false;
    }

    public void addHuman(){
        System.out.println("Введи имя: ");
        String name = scanner.nextLine();
        System.out.println("Введи дату рождения (пример: 1993-01-05): ");
        String dateOfBirth = scanner.nextLine();
        if (!dateOfBirth.matches("[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}")){
            dateOfBirth = scanner.nextLine();
        }
        List<String> human = new ArrayList<>();
        Collections.addAll(human, name, dateOfBirth);
        presenter.addHuman(human);
        System.out.println("Человек добавлен");
    }

    public void removeHuman() {
        System.out.println("Введи ID для удаления: ");
        String strID = scanner.nextLine();
        try {
            int id = Integer.parseInt(strID);
            presenter.removeHuman(id);
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
    }
    public void searchHuman() {
        System.out.println("Введи имя для поиска");
        String lastName = scanner.nextLine();
        presenter.searchHuman(lastName);
    }
    public void saveToFile() {
        System.out.println("Введи имя файла");
        String nameToFile = scanner.nextLine();
        presenter.saveToFile(nameToFile);
    }
    public void loadFromFile() {
        System.out.println("Введи имя файла");
        String nameFile = scanner.nextLine();
        presenter.loadFromFile(nameFile);
    }
    public void showTree(){
        presenter.showTree();
    }
}