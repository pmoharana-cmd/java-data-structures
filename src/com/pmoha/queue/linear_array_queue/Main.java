package com.pmoha.queue.linear_array_queue;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(3);
        System.out.println(newQueue.isEmpty());
        newQueue.enQueue(12);
        newQueue.enQueue(19);
        newQueue.enQueue(11);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.isEmpty());
    }
}
