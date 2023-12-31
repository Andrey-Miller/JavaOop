package OopJava.Human.Comparators;

import OopJava.Human.Human;

import java.util.Comparator;
public class ComparatorByName<E extends Human> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
