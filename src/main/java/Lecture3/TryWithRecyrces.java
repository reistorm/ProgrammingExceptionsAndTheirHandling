package Lecture3;

import java.io.FileReader;
import java.io.IOException;


public class TryWithRecyrces {
    public static void main(String[] args) {
// в try положим запись и т.о. не надо выполнять finally, чтобы закрыть файл
        try (FileReader test = new FileReader("/Users/Родион/Desktop/Элиза/ProgrammingExceptionsAndTheirHandling/name2.txt")){
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
    }
}

