package com.pmoha.stack.linked_list_stack;

import com.pmoha.linked_list.single_linked_list.SinglyLinkedList;

public class Stack<E> {
    SinglyLinkedList<E> stack;

    public Stack() {
        stack = new SinglyLinkedList<>();
    }

    public void push(E value) {
        stack.insert(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

    public boolean isEmpty() {
        return stack.head == null;
    }

    public E pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            E val = stack.head.value;
            stack.delete(0);
            return val;
        }
    }

    public E peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            return stack.head.value;
        }
    }

    public void delete() {
        stack.deleteSLL();
    }
}
