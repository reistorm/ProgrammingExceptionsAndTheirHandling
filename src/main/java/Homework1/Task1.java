package Homework1;
// решение верное, проверено в autotest
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//        Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//        Метод divisionByZero - Деление на 0
//        Метод numberFormatException - Ошибка преобразования строки в число
//        Важно: они не должны принимать никаких аргументов
class Answer {
    public static void arrayOutOfBoundsException(Integer[] mas, Integer min) {
        // Напишите свое решение ниже
        if (min > mas.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static int divisionByZero(Integer a, Integer b) {
        // Напишите свое решение ниже
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void numberFormatException(String str) {
        // Напишите свое решение нижe
        try {
            Byte c = Byte.valueOf(str);
            System.out.println(c);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Integer min = 8;
        Integer[] mas = {1, 2, 3, 4, 5, 6};
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException(mas, min);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException("123a");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}