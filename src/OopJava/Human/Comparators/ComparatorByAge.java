package OopJava.Human.Comparators;

import OopJava.Human.Human;

import java.util.Comparator;
public class ComparatorByAge implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getBirthDate() == o2.getBirthDate())
            return 0;
        if (o1.getBirthDate().isBefore(o2.getBirthDate()) == true)
            return 1;
        else
            return -1;
    }
}
