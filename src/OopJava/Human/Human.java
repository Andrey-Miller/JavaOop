package OopJava.Human;

import java.io.Serializable;
import java.time.LocalDate;

public class Human implements Serializable, Comparable<Human> {
    private final int id;
    private final String name;
    private final LocalDate birthDate;
    private final LocalDate deathDate;
    private int motherID;
    private int fatherID;

    public Human(int id, String name, LocalDate birthDate, int motherID, int fatherID) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = null;
        this.motherID = motherID;
        this.fatherID = fatherID;
    }

    public Human(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = null;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public int getId() {
        return id;
    }

    public int getMotherID() {
        return motherID;
    }

    public int getFatherID() {
        return fatherID;
    }

    @Override
    public int compareTo(Human o) {

        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "%s : дата рождения - %s".formatted( name, birthDate);
    }
}