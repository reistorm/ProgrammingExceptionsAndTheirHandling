package Seminar3.task1;
// 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.
// 2. Создайте класс исключений, которое будет возникать при обращении к пустому
// элементу в массиве ссылочного типа. Исключение должно отображать понятное для
// пользователя сообщение об ошибке.
// 3. 4. Продемонстрировать работу каждого исключения

import Seminar2.MyArraySizeException;

import java.io.DataInput;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) {
        try {
            task1();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        try {task2(new String[]{"AAA", "BBB", "CCC", "DDD"}, 2);
            task2(new Integer[]{1, -4, null, 5}, 2);

        } catch (NullElementArrayException e) {
            System.out.println(e.getMessage());
            System.out.println("Индекс массива: " + e.getIndex());
        }
        try {
            task3("D://AA//BB//CC//aaa.txt");
        } catch (MyFileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Наименование файла: " +e.getFileName());
        }
    }

    static void task1() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException("Ошибка деления числа на ноль");
        }
    }

    // 2 задача
    static <T> void task2(T[] array, int index) {
        if (array[index] == null)
            throw new NullElementArrayException("Элемент массива не проинициализирован", index);
        System.out.println(array[index]);
    }

    static void task3(String fileName) throws MyFileNotFoundException {
        try(FileReader fileReader = new FileReader(fileName)) {

        }
        catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("Файл не найден", fileName);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

