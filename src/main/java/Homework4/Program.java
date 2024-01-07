package Homework4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Program {
    public static void main(String[] args) throws GenderException, FirstNameException, LastNameException, SurnameException, NumberFormatException, ParseException, java.text.ParseException {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> data = new HashMap<>();
        while (true) {
            System.out.println("Введите данные (Фамилия Имя Отчество Дата рождения Номер телефона Пол):");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 6) {
                System.out.println("Введены не все данные");
                continue;
            }
            String lastName = parts[0];
            String firstName = parts[1];
            String surname = parts[2];
            String dateOfBirth = parts[3];
            String phoneNumber = parts[4];
            String gender = parts[5];

            if (!isValidDate(dateOfBirth) || !isValidPhoneNumber(phoneNumber) || !isValidGender(gender) || !isValidLastName(lastName) || !isValidFirstName(firstName) || !isValidSurname(surname)) {
                System.out.println("Данные введены неверно. Попробуйте еще раз");
                continue;
            }

            String dataString = lastName + " " + firstName + " " + surname + " " + dateOfBirth + " " + phoneNumber + " " + gender;
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));
                writer.write(dataString);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            data.put(lastName, dataString);
        }
        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }

    private static boolean isValidDate(String dateOfBirth) throws ParseException, java.text.ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = dateFormat.parse(dateOfBirth);
        if(!dateFormat.equals(date)) {
            return true;
        } else {
            throw new ParseException("Неправильно введена дата", dateOfBirth);
        }
    }

    private static boolean isValidPhoneNumber(String phoneNumber) throws NumberFormatException{
        if (phoneNumber.length() == 12 && phoneNumber.contains("+")) {
            return true;
        } else {
            throw new NumberFormatException("Неправильно введен номер телефона", phoneNumber);
        }
    }

    public static boolean isValidGender(String gender) throws GenderException {
        if (gender != null && gender.equals("f") || gender.equals("m")) {
            return true;
        } else {
            throw new GenderException("Неправильно введен пол", gender);
        }
    }

    private static boolean isValidLastName(String lastName) throws LastNameException{
        if(lastName != null && lastName.matches("^[а-яА-яёЁ]*$")){
            return true;
        }
        else {
            throw new LastNameException("Неверно введена фамилия", lastName);
        }
    }

    private static boolean isValidFirstName(String firstName) throws FirstNameException {
        if (firstName != null && firstName.matches("^[а-яА-яёЁ]*$")) {
            return true;
        } else {
            throw new FirstNameException("Неверно введено имя", firstName);
        }
    }

    private static boolean isValidSurname(String surname) throws SurnameException{
        if (surname != null && surname.matches("^[а-яА-яёЁ]*$")){
            return true;
        }
        else {
            throw new SurnameException("Неверно введено отчество", surname);
        }
    }
}
