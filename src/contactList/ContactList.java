/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 17-02-2020
 *   Time: 10:19 PM
 */


package contactList;

import contactADT.ContactADT;

public class ContactList<Contact> implements ContactADT<Contact> {
    @Override
    public boolean add(Contact data) {
        return false;
    }

    @Override
    public Contact view() {
        return null;
    }

    @Override
    public Contact search(Contact data) {
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
