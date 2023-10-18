package Seminar1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения: метод может работать только с квадратными
//массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
public class Task2 {
    public static void main(String[] args) {
        try {
            Integer[][] arr = { {1,0,1}, {1,1,0}, {0,1,0} };
            System.out.println(checkMass(arr));
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
// try catch чтобы выводить исключения в виде сообщения
    }
    public static int checkMass(Integer[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr.length != arr[i].length) {
                throw new RuntimeException("Массив не квадратный: " + arr.length + "x" + arr[i].length);
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 1 || arr[i][j] < 0) {
                    throw new RuntimeException("Значения не удовлетворяет условию");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
