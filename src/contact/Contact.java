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
    String email = null;
    ArrayList<Integer> phoneNumber;

    @Override
    public String toString() {
        return ("---Here are all your contacts---" +
                "-------- * -------- * -------- * --------" +
                "First Name: " + firstName +
                "Last Name: " + lastName +
                "Contact Number(s): " + phoneNumber +
                "Email address: " + email +
                "-------- * -------- * -------- * -------- " +
                "-------- * -------- * -------- * --------");
    }


}
