package com.pmoha.queue.linked_list_queue;

import com.pmoha.linked_list.single_linked_list.Node;
import com.pmoha.linked_list.single_linked_list.SinglyLinkedList;

public class QueueLinkedList<E> {
    SinglyLinkedList<E> linkedList;

    public QueueLinkedList() {
        this.linkedList = new SinglyLinkedList<>();
        System.out.println("Queue is successfully created!");
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    public void enQueue(E value) {
        linkedList.insert(value, linkedList.size);
        System.out.println("Successfully inserted " + value + " in the queue.");
    }

    public E deQueue() {
        if(linkedList.head == null) {
            System.out.println("Queue does not exist!");
            return null;
        } else {
            E tempValue = linkedList.head.value;
            linkedList.delete(0);
            return tempValue;
        }
    }

    public E peek() {
        if(linkedList.head == null) {
            System.out.println("Queue does not exist!");
            return null;
        } else {
            return linkedList.head.value;
        }
    }

    public void deleteQueue() {
        linkedList.head = null;
        linkedList.tail = null;
        linkedList.size = 0;
        System.out.println("Queue has been deleted.");
    }
}
