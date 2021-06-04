package com.zalatukha.linkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {
    private CustomLinkedList<String> linkedList;

    @Before
    public void initializeCustomLinkedList() {
        linkedList = new CustomLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
    }

    @Test
    public void add() {
        linkedList.add("D");
        assertEquals("D", linkedList.getByIndex(3));
    }

    @Test
    public void addByIndex() {
        linkedList.addByIndex("E", 0);
        assertEquals("E", linkedList.getByIndex(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void wrongIndexSpecified() {
        linkedList.addByIndex("Wrong index", 22);
    }

    @Test
    public void remove() {
        int size = linkedList.getSize();
        linkedList.remove(0);
        assertEquals(linkedList.getSize(), size - 1);
    }

    @Test
    public void getByIndex() {
        assertEquals(linkedList.getByIndex(0), "A");
    }

    @Test
    public void clearList() {
        linkedList.clearList();
        assertEquals(0, linkedList.getSize());
    }


    @Test
    public void getSize() {
        assertEquals(3, linkedList.getSize());
    }


    @Test
    public void reverseList() {
        linkedList.reverseList();
        assertEquals("C", linkedList.getByIndex(0));
        assertEquals("B", linkedList.getByIndex(1));
        assertEquals("A", linkedList.getByIndex(2));
    }


}

