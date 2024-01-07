//package Homework3;
//
//public class Note extends User {
//    protected Note(String FirstName, String name, String surname, String birthday, String phone, String gender) {
//        super(FirstName, name, surname, birthday, phone, gender);
//    }
//
//    public static Note create(String FirstName, String name, String surname, String birthday, String phone, String gender) throws DataNameException, DataFirstNameException, DataSurnameException, DataPhoneException {
//        if (FirstName == null || !FirstName.matches("^[a-zA-z]*$"))
//            throw new DataFirstNameException("Некорректные данные", FirstName);
//        if (name == null || !name.matches("^[a-zA-z]*$"))
//            throw new DataNameException("Некорректные данные", name);
//        if (surname == null || !surname.matches("^[a-zA-z]*$"))
//            throw new DataSurnameException("Некорректные данные", surname);
//        if (phone == null || phone.length() != 11)
//            throw new DataPhoneException("Некорректные данные", phone);
//        return new Note(FirstName, name, surname, birthday, phone, gender);
//    }
//}
