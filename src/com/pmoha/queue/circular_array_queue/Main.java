package com.pmoha.queue.circular_array_queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue newQueue = new CircularQueue(3);
        System.out.println(newQueue.isFull());
        newQueue.enQueue(10);
        newQueue.enQueue(12);
        System.out.println(newQueue.deQueue());
        newQueue.enQueue(16);
        newQueue.enQueue(13);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());
        System.out.println(newQueue.deQueue());
        newQueue.deleteQueue();
    }
}
