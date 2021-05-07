package com.zalatukha.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Buffer<T> {
    private List<T> buffer = new ArrayList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(T t) {

        while (buffer.size() >= capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(t);
        notify();
    }

    public synchronized T consume() {

        while (buffer.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T value = buffer.remove(0);
        notify();
        return value;
    }
}
