package Seminar3.task2;

/*
Задача 2:
========
Создайте класс Счетчик, у которого есть метод Add(), увеличивающий значение внутренней
int переменной на 1. Сделайте так, чтобы с объектом такого типа можно было работать
в блоке try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса?
Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого
ресурса должен выброситься IOException.
 */
public class Program {
    public static void main(String[] args) {
        // close вызываем через try-with-resources
        try (Counter counter = new Counter(1000)){
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            System.out.println("Текущее состояние счетчика: " + counter.getCounter());

//            counter.add();
//            counter.add();
//            counter.add();
//            System.out.println("Текущее состояние счетчика: " + counter.getCounter());
        } catch (CloseCounterExxception e) {
            System.out.println(e.getMessage());
        }
    }
}
