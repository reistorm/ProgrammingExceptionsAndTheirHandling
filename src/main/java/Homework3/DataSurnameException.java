//package Homework3;
//
//public class DataSurnameException extends DataException{
//    private String surname;
//
//    public DataSurnameException(String message, String surname) {
//        super(message);
//        this.surname = surname;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//    public static boolean SurnameIsString(String surname) {
//        try{
//            return surname != null && surname.matches("^[a-zA-z]*$");
//        } catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//        return true;
//    }
//}
