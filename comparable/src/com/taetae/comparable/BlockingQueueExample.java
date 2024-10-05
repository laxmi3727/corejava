package com.taetae.comparable;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<Integer> intQueue = new PriorityBlockingQueue<>(5);

        try { 
            intQueue.put(10);
            intQueue.put(20);
            intQueue.put(30);
            intQueue.put(40);
            intQueue.put(50);
            
            
            intQueue.take();
            intQueue.take();
            intQueue.take();
            intQueue.take();
            intQueue.take();
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Producer thread
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("set " + i);
                    intQueue.put(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer thread
        new Thread(() -> {
            while (true) {
                try {
                    int temp = intQueue.take();
                    System.out.println("Get" + temp);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
