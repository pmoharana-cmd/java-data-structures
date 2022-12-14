package com.pmoha.queue.linear_array_queue;

public class Queue {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;

    public Queue(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue successfully created with size " + size);
    }

    public boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full!");
        } else if(isEmpty()) {
            beginningOfQueue = 0;
            arr[++topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        } else {
            arr[++topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        }
    }

    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is already empty!");
            return -1;
        } else {
            int retValue = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return retValue;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public void deleteQueue() {
        arr = new int[arr.length];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Queue has been successfully deleted");
    }
}
