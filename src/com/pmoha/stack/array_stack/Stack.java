package com.pmoha.stack.array_stack;

public class Stack {
    int[] stack;
    int topOfStack;

    public Stack(int size) {
        stack = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created with size of " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == stack.length - 1;
    }

    public void push(int ele) {
        if(isFull()) {
            System.out.println("Stack is full!");
        } else {
            stack[++topOfStack] = ele;
            System.out.println("The value is successfully inserted at index " + topOfStack);
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int topStack = stack[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[topOfStack];
        }
    }

    public void deleteStack() {
        if(isEmpty()) {
            System.out.println("Stack is already empty!");
        } else {
            stack = new int[stack.length];
            topOfStack = -1;
            System.out.println("Stack is deleted!");
        }
    }
}
