/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 18-02-2020
 *   Time: 09:57 PM
 */


package main;

import contact.Person;
import contactList.ContactList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String email;
        ArrayList<String> phoneNumber = new ArrayList<>();
        ContactList<Person> contactList = new ContactList<>();
        ArrayList<String> names = new ArrayList<>();
        char option;
        while (true) {
            System.out.println("Welcome to Abhishek's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");
            int choice = scanner.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                switch (choice) {
                    case 1:
                        System.out.println("You have chosen to add a new contact: \n" +
                                "Please enter the name of the Person\n");
                        System.out.print("First Name: ");
                        firstName = scanner.next();
                        System.out.println("Last Name: ");
                        lastName = scanner.next();
                        System.out.println("Phone Number: ");
                        String mobileNumber = scanner.next();
                        phoneNumber.add(mobileNumber);
                        System.out.println("Would you like to add another contact number? (y/n): ");
                        option = scanner.next().charAt(0);
                        if (option == 'y' || option == 'Y') {
                            System.out.println("Phone Number: ");
                            mobileNumber = scanner.next();
                            phoneNumber.add(mobileNumber);
                        } else {
                            break;
                        }
                        System.out.println("Email: ");
                        email = scanner.next();
                        Person person = new Person(firstName, lastName, email, phoneNumber);
                        contactList.add(person);
                        break;

                    case 2:
                        contactList.view();
                        break;
                }
            }
        }

    }

}
