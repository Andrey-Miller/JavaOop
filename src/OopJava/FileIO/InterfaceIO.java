package OopJava.FileIO;

import OopJava.Tree.FamilyTree;

public interface InterfaceIO<E> {
    FamilyTree read(String str);
    void save(FamilyTree familyTree, String str);
}
