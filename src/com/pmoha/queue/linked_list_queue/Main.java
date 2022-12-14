package com.pmoha.queue.linked_list_queue;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();
        System.out.println(queue.isEmpty());
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(19);
        queue.enQueue(1);
        System.out.println(queue.isEmpty());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.peek());
        System.out.println(queue.deQueue());
        queue.deleteQueue();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
