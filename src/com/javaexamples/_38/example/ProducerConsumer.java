package com.javaexamples._38.example;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    // ArrayBlockingQueue thread'leri birbirinden blokluyor
    Random rnd = new Random();
    // blockingQueue içinde maksimum 10 tane değer olacak
    BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

    public void producer() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Integer value = rnd.nextInt(100);
                // arrayin tam boyutu 10 olmuşsa producer thread'i burada consumer
                // threa'inin çalışmasını bekleyecek
                blockingQueue.put(value);
                System.out.println("Producer Üretiyor : " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consumer() {

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                // kuyruğun en başındaki değeri alacak
                Integer value = blockingQueue.take();
                System.out.println("Consumer Tüketiyor : " + value);
                System.out.println("Queue Size : " + blockingQueue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}