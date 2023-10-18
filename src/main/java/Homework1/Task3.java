package Homework1;

import java.util.Arrays;

class Answer2 {
    public int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (a == null || b == null || a.length != b.length) {
            return new int[1];
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer2 ans = new Answer2();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
