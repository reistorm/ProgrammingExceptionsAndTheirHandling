package Homework4;

public class NumberFormatException extends DataException{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public NumberFormatException(String message, String phoneNumber){
        super(message);
        this.phoneNumber = phoneNumber;
    }
}
