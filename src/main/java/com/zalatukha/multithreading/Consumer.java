package com.zalatukha.multithreading;

import java.util.List;

class Consumer implements Runnable {
    private final List<Integer> sharedList;

    public Consumer(List<Integer> sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed integer: " + consume());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Метод, извлекающий элементы из общей очереди
    private Integer consume() throws InterruptedException {
        synchronized (sharedList) {
            if (sharedList.isEmpty()) { // Если пуста, надо ждать
                sharedList.wait();
            }

            sharedList.notifyAll();
            return sharedList.remove(0);
        }
    }
}
