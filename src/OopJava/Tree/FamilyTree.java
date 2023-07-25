package OopJava.Tree;


import OopJava.Human.Comparators.ComparatorByAge;
import OopJava.Human.Comparators.ComparatorByName;
import OopJava.Human.Human;
import OopJava.Human.HumanIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends Human> implements Serializable, Iterable<E> {
    private final List<E> familyTree;

    public FamilyTree(List<E> familyTree) {
        this.familyTree = familyTree;
    }
    public List<E> getFamilyTree() {
        return familyTree;
    }

    public FamilyTree() {
        this.familyTree = new ArrayList<>();
    }

    public void add(E human) {
        this.familyTree.add(human);
    }

    @Override
    public String toString() {
        for (Human item : familyTree) {
            System.out.println(item);
        }
        return " ";
    }

    public void parentsHuman(E human) {
        E mather = null;
        E father = null;
        for (E item : familyTree) {
            if (item.getId() == human.getMotherID()) mather = item;
            if (item.getId() == human.getFatherID()) father = item;
        }
        System.out.printf("Исследуемый объект:\n%s\nМать - %s\nОтец - %s", human, mather, father);
    }

    public void childrensHuman(E human) {
        List<E> childrens = new ArrayList<>();
        for (E item : familyTree) {
            if (item.getFatherID() == human.getId() || item.getMotherID() == human.getId()) {
                childrens.add(item);
            }
        }
        if (childrens.size() > 0) {
            System.out.printf("\nИсследуемый объект:\n%s\nДети объекта:\n", human);
            for (E item : childrens) System.out.print(item);
        } else System.out.printf("\nИсследуемый объект:\n%s\nДетей нет", human);
    }
    @Override
    public Iterator<E> iterator() {

        return new HumanIterator<E>(familyTree);
    }

    public void sortByAge() {
        familyTree.sort( new ComparatorByAge());
    }

    public void sortByName() {

        familyTree.sort(new ComparatorByName<>());
    }

    public void delHuman(int id) {
        for (E item : this) {
            if (item.getId() == id) {
                getFamilyTree().remove(item);
            }
        }
    }

    public List<E> searchHuman(String name) {
        List<E> searchTemp = new ArrayList<>();
        for (E item : familyTree) {
            if (item.getName().equals(name)) searchTemp.add(item);
        }
        return searchTemp;
    }
}