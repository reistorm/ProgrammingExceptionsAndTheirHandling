package Homework4;

public class ParseException extends DataException{
    private final String dateOfBirth;

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public ParseException(String message, String dateOfBirth){
        super(message);
        this.dateOfBirth = dateOfBirth;
    }
}
