package com.company;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.print();

        linkedList.deleteByData(4);
        linkedList.print();

        linkedList.deleteByData(8);

        linkedList.deleteByIndex(5);
        linkedList.print();

        linkedList.deleteByIndex(2);
        linkedList.print();

        LinkedList linkedList2 = new LinkedList();
        linkedList2.deleteByIndex(0);
        linkedList2.deleteByData(0);

    }
}
