package Lecture3;

import java.io.IOException;
import java.util.Date;
// создадим новое исключение
// должен обязательно содержать message и предыдущее исключение e,
// которое не удалось обработать

public class SavedException extends IOException  {
    // добавим дату начала операции
    Date date = new Date();
    private Date startDate;
    public SavedException(String message, Date startDate, Exception e) {
        super(message, e);
        this.startDate = startDate;
        // в методе, который будет обрабатывать исключение:
        // throw new SavedException("Saved document", e);
        // в шапке метода писать throws SavedException
    }
}
