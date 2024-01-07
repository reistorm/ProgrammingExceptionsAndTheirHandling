package Homework4;

public class GenderException extends DataException{
    private String gender;

    public String getGender() {
        return gender;
    }
    public GenderException(String message, String gender){
        super(message);
        this.gender = gender;
    }
}
