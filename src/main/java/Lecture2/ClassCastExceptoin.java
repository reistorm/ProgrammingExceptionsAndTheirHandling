package Lecture2;

import java.io.File;
// ClassCastExceptoin -неверное приведение типов
public class ClassCastExceptoin {
    public static void main(String[] args) {
        Object object = new String("123");
        // к классу файл приведем строку
        File file = (File) object;
        System.out.println(file);
    }
}
