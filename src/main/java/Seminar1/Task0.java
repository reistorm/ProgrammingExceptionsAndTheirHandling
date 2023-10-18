package Seminar1;
// реализовать метод, принимающий в качестве аргумента
// целочисленный массив. Если длина массива меньше некоторого заданного
// минимума, то метод возвращает -1 в качестве кода ошибки, иначе - длину массива

public class Task0 {
    public static Integer CheckMas(Integer[] mas, Integer min) {
        if(mas.length > min) {
            return mas.length;
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer min = 5;
        Integer[] mas = {1,5,6,3,7,8,6};
        System.out.println(CheckMas(mas, min));
    }
}
