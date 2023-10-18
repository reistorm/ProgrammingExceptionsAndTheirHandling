package Lecture1;

import java.io.File;

public class Application {
//    public static void main(String[] args) {
////        System.out.println(getFileSize(new File("123")));
//        System.out.println(divide(0,0));
//    }
// если файл существует, то вернет функция размер файла; файла нет - -1
    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
// калькулятор с ошибкой деления на ноль
    public static int divide1(int a1, int a2){
        if (a2 == 0) {
            return -1;
        }
        return a1/a2;
    }
// нет 1000 элемента массива
    public static void main(String[] args) {
        System.out.println(divide(10,0));
        //a();
//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
    }
//    public static void a() {
//        b();
//    }
//    public static void b() {
//        c();
//    }
//    public static void c() {
//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
//    }

    public static int divide(int b1, int b2) {
        if (b2 == 0) {
            throw new RuntimeException("Divide by zero not permited");
        }
        return b1/b2;
    }
}
