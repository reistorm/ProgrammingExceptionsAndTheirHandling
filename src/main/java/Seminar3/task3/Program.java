package Seminar3.task3;
/*
Спроектировать серию классов для работы с животными. Защитить состояние и поведение
класса, используя исключения.
 */
public class Program {
    public static void main(String[] args) {
        // через create не получится создать животное, тк включение исключение AnimalNameException
//        Animal animal = Animal.create("Барсик");
        try{
            Cat cat1 = new Cat("Вася");
            cat1.swim(10);
            cat1.run(10);
        }catch (AnimalRunException e) {
            System.out.println(e.getMessage());
        }catch (AnimalSwimException e){
            System.out.println(e.getMessage());

        }
        catch (AnimalNameException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
