package Homework2;
// Напишите программу, которая вычисляет значение выражения
// intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
// Программа проверяет, имеется ли в массиве intArray элемент с индексом 8,
// и если нет, выводит сообщение о невозможности выполнения операции.
// Также программа проверяет, равен ли делитель d нулю, и если да, выводит
// соответствующее сообщение.

import java.util.Arrays;

class Expr1 {

    public static double expr(int[] intArray, int d) {
        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        } else if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } else {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + catchedRes1);
            return catchedRes1;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public class Task2 {
        public static void main(String[] args) {
            int[] intArray;
            int d;

            if (args.length == 0) {
                intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 15, 18, 19};
                d = 0; // По умолчанию используем 0, если аргумент не передан
            } else {
                intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
                d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
            }
            double result = Expr1.expr(intArray, d);
            System.out.println(result);
        }
    }
