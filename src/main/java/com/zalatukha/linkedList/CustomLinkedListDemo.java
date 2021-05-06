package com.zalatukha.linkedList;

public class CustomLinkedListDemo {
    public static void main(String[] args) {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();

        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.getByIndex(i));
        }

        linkedList.addByIndex("A", 1);
        System.out.println("______________________");
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.getByIndex(i));
        }

        System.out.println("______________________");
        System.out.println(linkedList.getByIndex(3));
        System.out.println("______________________");

        System.out.println("______________________");
        System.out.println(linkedList.getSize());
        System.out.println("______________________");

        linkedList.reverseList();
        System.out.println("______________________");
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.getByIndex(i));
        }

        linkedList.clearList();
        System.out.println("______________________");
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.getByIndex(i));
        }

    }
}
