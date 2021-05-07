package com.zalatukha.multithreading;

public class Demo {
    public static void main(String[] args) {

        Buffer<Integer> buffer = new Buffer<>(1);

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}
