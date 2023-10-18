package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

// Запишите в файл следующие строки:
// Анна = 4, Елена = 5, Марина = 6, Владимир = ?, Константин =?, Иван = 4
//Реализуйте метод, который считывает данные из файла и сохраняет
// в двумерный массив (либо HashMap). В отдельном методе нужно пройти по
// структуре данных, если сохранено значение ?, заменить на соот-ее число.
// Если на каком-то месте встречается символ отличный от числа или ?, то
// бросить подходящее исключение
public class Task2 {
    private static Random random = new Random();

    public static void main(String[] args) {
        prepareFile();
    }

    static void prepareFile() {
        FileWriter fileWriter = null;
        try {
            // создание файла, после наименования можно выбрать добавлять к файлу новые
            // данные или нет, пишем имя файла и true/false на append
            fileWriter = new FileWriter("name.txt", false);
            fileWriter.write("Анна=4\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");
            if (random.nextInt(2) == 0) // 50%
            {
                throw new Exception("Неожиданное исключение");
            }
            fileWriter.write("Владимир=?\n");
            fileWriter.write("Константин=?\n");
            fileWriter.write("Иван=4\n");
            fileWriter.flush();
            fileWriter.close();
        }
        // сперва класс-наследник IOException, потом базовый класс Exception
        // если сперва ставить Exception, то другие исключения просто никогда не обработаются
        catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch
            (IOException e) {
            }
        }
    }
}
