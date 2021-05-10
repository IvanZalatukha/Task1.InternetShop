package com.zalatukha.multithreading;

import java.util.List;
import java.util.Random;

class Producer implements Runnable {
    private final List<Integer> sharedList;
    private final int SIZE;

    public Producer(List<Integer> sharedList, int size) {
        this.sharedList = sharedList;
        this.SIZE = size;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced integer: " + produce());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Integer produce() throws InterruptedException {
        synchronized (sharedList) {
            if (sharedList.size() == SIZE) {
                // Если очередь полна, то ждём
                sharedList.wait();
            }

            Random random = new Random();
            Integer newValue = random.nextInt();
            sharedList.add(newValue);

            // Уведомили другой поток на случай, если он ждет
            sharedList.notifyAll();

            return newValue;
        }
    }
}