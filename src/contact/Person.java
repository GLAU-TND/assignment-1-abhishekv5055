/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 17-02-2020
 *   Time: 10:20 PM
 */


package contact;

import java.util.ArrayList;

public class Person {
    String firstName;
    String lastName;
    String email;
    ArrayList<String> phoneNumber;

    public Person() {
    }

    public Person(String firstName, String lastName, String email, ArrayList<String> phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("-------- * -------- * -------- * --------\n" +
                "First Name: " + firstName +
                "\nLast Name: " + lastName +
                (phoneNumber.size() == 1 ? "\nContact Number: " + phoneNumber : "\nContact Number(s): " + phoneNumber) +
                "\nEmail address: " + email +
                "\n-------- * -------- * -------- * -------- ");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
