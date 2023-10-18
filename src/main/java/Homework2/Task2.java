package Homework2;
// Напишите программу, которая вычисляет значение выражения
// intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
// Программа проверяет, имеется ли в массиве intArray элемент с индексом 8,
// и если нет, выводит сообщение о невозможности выполнения операции.
// Также программа проверяет, равен ли делитель d нулю, и если да, выводит
// соответствующее сообщение.

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {

        for (int i = 0; i < intArray.length; i++) {
            double result1 = 0;
            if (i >= 8 && d != 0) {
                try {
                    result1 = intArray[8] / d;
                    System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + result1);
                } catch (ArithmeticException e) {
                    System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.\n" +
                            "NaN");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out Of Bounds Exception");
                }
            }
        }
        return intArray[8] * 1 / d;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task2 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 15, 9};
            d = 0; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }
        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}
