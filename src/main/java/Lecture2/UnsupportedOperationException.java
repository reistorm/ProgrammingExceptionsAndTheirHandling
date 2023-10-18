package Lecture2;

import java.util.Collections;
import java.util.List;

// UnsupportedOperationException - попытка выполнения нереализованного метода
public class UnsupportedOperationException {
    public static void main(String[] args) {
        // у класса Collections есть пустой лист неизменяемый emptyList
        List<Object> emptyList = Collections.emptyList();
        // добавим к нему новый объект, но метод add он не поддерживает, тк
        // является неизменяемым константным объектом
        emptyList.add(new Object());
    }
}

