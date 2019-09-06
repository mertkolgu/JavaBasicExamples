package com.javaexamples._39.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

    Random rnd = new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<>();
    private int limit = 10;

    public void producer() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = rnd.nextInt(100);
                queue.offer(value);
                System.out.println("Producer Üretiyor : " + value);
                // eğer bekleyen bir consumer varsa, producer uyanmış olacak
                lock.notify();
            }
        }
    }

    public void consumer() {

        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = queue.poll();
                System.out.println("Consumer Tüketiyor : " + value);
                System.out.println("Queue Size : " + queue.size());
                // eğer bekleyen bir producer varsa, consumer uyanmış olacak
                lock.notify();
            }
        }
    }
}