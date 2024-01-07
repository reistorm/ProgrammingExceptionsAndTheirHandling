package Homework4;

public class FirstNameException extends DataException{
    public String firstName;

    public String getFirstName() {
        return firstName;
    }
    public FirstNameException(String message, String firstName){
        super(message);
        this.firstName = firstName;
    }
}
