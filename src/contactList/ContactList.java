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
    public int size = 0;

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

    public Node<Contact> getNode(int index) {
        Node<Contact> response = head;
        for (int i = 0; i < index && response != null; i++) {
            response = response.getNext();
        }
        return response;
    }

    private boolean addFirst(Contact data) {
        head = new Node<>(data, null);
        size++;
        return true;
    }

    private boolean addAfter(Contact data, Node<Contact> node) {
        node.next = new Node<>(data, node.next);
        size++;
        return true;
    }

    private boolean add(Contact data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            return addFirst(data);
        } else {
            Node<Contact> temp = getNode(index - 1);
            return addAfter(data, temp);
        }
    }

    @Override
    public boolean add(Contact data) {
        return add(data, size);
    }

    @Override
    public void view() {
            for (int i = 0; i < size; i++) {
                Contact data = this.getNode(i - 1).getData();
                System.out.println(data);
            }
    }

    @Override
    public Contact search(Contact data) {
        Contact response = null;
        for (int i = 0; i < size; i++) {
            Contact item = this.getNode(i).getData();
            if (item.equals(data)) {
                response = item;
                break;
            }
        }
        return response;
    }

    private Contact deleteFirst() {
        Contact response = null;
        Node<Contact> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (response != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    private Contact deleteAfter(Node<Contact> node) {
        Contact response = null;
        Node<Contact> temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
        }
        if (response != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    public Contact delete(int index) {
        Contact response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            deleteFirst();
        } else {
            Node<Contact> temp = getNode(index - 1);
            response = deleteAfter(temp);
        }
        return response;
    }


    @Override
    public Contact delete() {
        return delete(size - 1);
    }
}
