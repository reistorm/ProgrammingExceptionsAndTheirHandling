package Homework3;

public class DataPhoneException extends DataException {
    private String phone;

    public DataPhoneException(String message, String phone) {
        super(message);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public static boolean PhoneNumber(String phone) {
        if (phone.length() == 11) {
            try {
                System.out.println(phone);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
        return true;
    }
}
