//package Homework3;
//
//public class DataNameException extends DataException{
//    private String name;
//
//    public DataNameException(String message, String name) {
//        super(message);
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public static boolean NameIsString(String name){
//        try{
//            return name != null && name.matches("^[a-zA-z]*$");
//        } catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//        return true;
//    }
//}
