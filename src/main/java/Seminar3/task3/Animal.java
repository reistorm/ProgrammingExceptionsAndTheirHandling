package Seminar3.task3;

public class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void swim(int distance) throws AnimalSwimException;

    public abstract void run(int distance) throws AnimalRunException;

}
