package Homework2;
//Напишите программу для выполнения арифметической операции
// деления двух целых чисел a и b.
//При этом программа должна проверить, что делитель b не равен нулю,
// и выполнить деление только в этом случае.
//Если b равен нулю, программа должна вывести сообщение о невозможности
// выполнения операции и вернуть результат равный нулю.
//После выполнения операции деления, программа также должна вывести
// сумму чисел a и b с помощью метода printSum.
//Если аргументы не переданы через командную строку,
// используйте значения по умолчанию.
class Expre {

    public static double expre(int a, int b) {
        double result = 0.0; // Initialize the result
        if (b != 0) {
            result = (double) a / b; // Perform the division and store the result
        }
        printSum(a, b);
        return result; // Return the result
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 30; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expre.expre(a, b);
        System.out.println(result);
    }
}
