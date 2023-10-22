package Lecture3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToOtherFile {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("/Users/Родион/Desktop/Элиза/ProgrammingExceptionsAndTheirHandling/name2.txt")) {
            FileWriter writer = new FileWriter("test");
            // скопируем содержимое файла в другой файл,
            // читать пока есть что читать, а сообшение записывать в Writer
            while (reader.ready()){
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
        // try можно использовать без catch, но с finally
        try{
            System.out.println("test operation");
        }
        finally {
            System.out.println("finally operation");
        }
    }
}
