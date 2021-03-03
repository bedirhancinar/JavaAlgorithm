package com.company;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node first;

    public LinkedList() {

    }

    public void add(int data) {
        Node add = new Node(data);
        if (first == null) {
            first = add;
        } else {
            Node last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = add;
        }
    }

    public void deleteByData(int data) {
        Node current = first;
        Node previous = null;

        if (current == null) {
            System.out.println("List empty.");
        } else if (current.data == data) {
            first = current.next;
        } else {
            while (current != null && current.data != data) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println("Data not found.");
            } else {
                previous.next = current.next;
            }
        }
    }

    public void deleteByIndex(int index) {
        Node current = first;
        Node previous = null;

        int i = 0;
        boolean delete = false;
        if (current == null) {
            System.out.println("List empty.");
        } else {
            while (current.next != null) {
                if (i == index) {
                    previous.next = current.next;
                    delete = true;
                    break;
                }
                previous = current;
                current = current.next;
                i++;
            }
            if (!delete)
                System.out.println("List don't have this index.");
        }
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}


