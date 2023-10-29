package Seminar3.task3;

public class Cat extends Animal{

    protected Cat(String name) {
        super(name);
    }
    /*
    создание объекта через использование фабричного метода
    @param name
    @return
    @throws AnimalNameException
     */
    public static Animal create(String name) throws AnimalNameException{
        if (name == null || name.length() < 3)
            throw new AnimalNameException("Некорректное имя котика: ", name);
        return new Animal(name);
    }
    public void run(int distance) throws AnimalRunException{
        if (distance < 50){
            //TODO:  Котик бегает
        }
        else {
            throw new AnimalRunException("Котику тяжело бежать", name, distance);
        }
    }
    public void swim(int distance) throws AnimalSwimException{
        throw new AnimalSwimException("Кот не умеет плавать", name, distance);
    }
}
