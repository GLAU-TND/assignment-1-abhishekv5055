/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 17-02-2020
 *   Time: 10:19 PM
 */


package contactList;

import contactADT.ContactADT;

public class ContactList<Contact> implements ContactADT<Contact> {
    private Node<Contact> head = null;
    private int size = 0;

    private class Node<Contact> {
        Contact data;
        Node<Contact> next;

        private Node(Contact data, Node<Contact> next) {
            this.data = data;
            this.next = next;
        }

        private Contact getData() {
            return data;
        }

        private Node<Contact> getNext() {
            return next;
        }
    }

    private Node<Contact> getNode(int index) {
        Node<Contact> response = head;
        for (int i = 0; i < index && response != null; i++) {
            response = response.getNext();
        }
        return response;
    }

    private boolean addFirst(Contact data) {
        Node<Contact> node = new Node<>(data, null);
        size++;
        return true;
    }

    private boolean addAfter(Contact data, Node<Contact> node) {
        Node<Contact> newNode = new Node<>(data, node.getNext());
        size++;
        return true;
    }

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
