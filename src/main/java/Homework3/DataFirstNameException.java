//package Homework3;
//
//public class DataFirstNameException extends DataException{
//    private String FirstName;
//
//    public DataFirstNameException(String message, String firstName) {
//        super(message);
//        FirstName = firstName;
//    }
//
//    public String getFirstName() {
//        return FirstName;
//    }
//    public static boolean FirstNameIsString(String FirstName){
//        try{
//            return FirstName != null && FirstName.matches("^[a-zA-z]*$");
//        } catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//        return true;
//    }
//}
