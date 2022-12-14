package com.pmoha.queue.circular_array_queue;

public class CircularQueue {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;
    private int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("New Circular Queue successfully created with size " + size);
    }

    public boolean isFull() {
        return (topOfQueue == size - 1 && beginningOfQueue == 0) || (topOfQueue == beginningOfQueue - 1);
    }

    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Circular Queue is full!");
        } else if(isEmpty()) {
            beginningOfQueue = 0;
            arr[++topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        } else {
            if(topOfQueue == size - 1) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue.");
        }
    }

    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is already empty!");
            return -1;
        } else {
            int retValue = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                topOfQueue = -1;
                beginningOfQueue = -1;
            }
            else if(beginningOfQueue == size - 1) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return retValue;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("Circular Queue is empty!");
            return -1;
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("Queue has been successfully deleted");
    }
}
