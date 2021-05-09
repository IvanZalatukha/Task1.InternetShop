package com.zalatukha.multithreading;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> sharedQueue = new LinkedList<>();
        int size = 4;
        Thread producerThread = new Thread(new Producer(sharedQueue, size));
        Thread consumerThread = new Thread(new Consumer(sharedQueue));
        producerThread.start();
        consumerThread.start();
    }
}
