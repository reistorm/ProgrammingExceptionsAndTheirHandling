 package Seminar1;
// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
// значение. Метод ищет в массиве заданное значение и возвращает его индекс.
// При этом, например:
// 1. Если длина массива меньше некоторого заданного минимума, метод возвращает
// -1 в качестве кода ошибки
// 2. Если искомый элемент не найден, метод вернет -2 как код ошибки
// 3. Если вместо массива пришел null, метод вернет -3
// 4. Придумать свои варианты исключений

// Написать метод, в котором реализуйте взаимодействие с пользователем
//То есть, этот метод запросит искомое число у пользователя, вызовет первый,
// обработает возвращенное значение и покажет читаемый результат пользователю.
// Например, если вернулся -2 => "Искомый элемент не найден"
public class Task1 {
    public static  String ErrorMessage (Integer numError){
        if(numError == -1){
            return "Длина массива меньше заданного минимума";
        }
        else if(numError == -2){
            return "Искомый элемент не найден";
        }
        else if(numError == -3){
            return "mas == null";
        }
        else {
            return "Индекс равен " + numError;
        }
    }
    public static Integer FindElement(Integer[] mas, Integer value){
        Integer min = 5;
        if(mas == null){
            return -3;
        }
        if(min > mas.length){
            return -1;
        }
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] == value){
                return i;
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        Integer min = 3;
        Integer[] mas = {1,5,6,3,7,8,6};
        System.out.println(ErrorMessage(FindElement(mas, min)));
    }
}
