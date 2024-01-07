package Homework4;

public class SurnameException extends DataException{
    private String surname;

    public String getSurname() {
        return surname;
    }
    public SurnameException(String message, String surname){
        super(message);
        this.surname = surname;
    }
}
