package Homework3;

import javax.xml.crypto.Data;
import java.io.File;

/*
Напишите приложение, которое будет запрашивать у пользователя
следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество дата рождения номер телефона пол
 */
public class User {

    public String FirstName;
    public String name;
    public String surname;
    public String birthday;
    public String phone;
    public String gender;

    public User(String firstName, String name, String surname, String birthday, String phone, String gender) {
        FirstName = firstName;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public void user_data(){
        System.out.println();
    }

    public String fullName(){
        return String.format("%s %s", FirstName, name, surname, birthday, phone, gender);

    }
}
