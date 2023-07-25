package OopJava.Service;

import OopJava.Human.Human;
import OopJava.Tree.FamilyTree;
import OopJava.FileIO.InterfaceIO;
import OopJava.FileIO.FileIO;
import java.time.LocalDate;

public class Service {
    private int id;
    private FamilyTree<Human> family;

    public Service(FamilyTree family) {
        this.family = family;

    }

    public FamilyTree getFamily() {
        return family;
    }

    public void addHuman(String name, LocalDate dateOfBirth, Human mother, Human father) {
        id++;
        family.add(new Human(id, name, dateOfBirth, father.getMotherID(), mother.getFatherID()));
    }

    public void addHuman(String name, LocalDate dateOfBirth) {
        id++;
        family.add(new Human(id, name, dateOfBirth));
    }
    public void saveFamily(String str) {
        FileIO save = new FileIO();
        save.save(this.family, str);
    }

    public void sortByName() {
        family.sortByName();
    }

    public boolean removeHuman(int id) {
        family.delHuman(id);
        return true;
    }

    public Object searchHuman(String name) {

        return family.searchHuman(name);
    }

    public void loadFamily(String str) {
        InterfaceIO load = new FileIO();
        this.family = load.read(str);
        id = 1;
        for (Human item : this.family) {
            if (id < item.getId()) id = item.getId();
        }
    }
}
