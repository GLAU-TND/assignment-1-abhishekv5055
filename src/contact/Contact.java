/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 17-02-2020
 *   Time: 10:20 PM
 */


package contact;

import java.util.ArrayList;

public class Contact {
    String firstName;
    String lastName;
    String email;
    ArrayList<Integer> phoneNumber;

    @Override
    public String toString() {
        return ("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------\n" +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nContact Number(s): " + phoneNumber +
                "\nEmail address: " + email +
                "\n-------- * -------- * -------- * -------- " +
                "\n-------- * -------- * -------- * --------");
    }

    public Contact(String firstName, String lastName, String email, ArrayList<Integer> phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public ArrayList<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ArrayList<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
