package OopJava.FileIO;

import OopJava.Tree.FamilyTree;

import java.io.*;

public class FileIO implements InterfaceIO{
    public FamilyTree read(String file) {
        FamilyTree tree = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            tree = (FamilyTree) objectInputStream.readObject();
        } catch (Exception msg) {
            System.out.println(msg.getMessage());
        }
        return tree;
    }
    public void save(FamilyTree tree, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(tree);
        } catch (Exception msg) {
            System.out.println(msg.getMessage());
        }
    }
}

