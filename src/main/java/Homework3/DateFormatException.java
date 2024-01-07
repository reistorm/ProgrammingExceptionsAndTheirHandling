package Homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatException implements DateValidator{
    private DateTimeFormatter dateTimeFormatter;
    public DateFormatException(DateTimeFormatter dateTimeFormatter){
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public boolean isValid(String birthdayStr){
        try{
            LocalDate.parse(birthdayStr, this.dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
}
