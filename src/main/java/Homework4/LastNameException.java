package Homework4;

public class LastNameException extends DataException{
    private String lastName;

    public String getLastName() {
        return lastName;
    }
    public LastNameException(String message, String lastName){
        super(message);
        this.lastName = lastName;
    }
}
