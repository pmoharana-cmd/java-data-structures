package com.pmoha.linked_list.interview_questions;

public class LinkedList<E> {
    public Node<E> head;
    public Node<E> tail;
    public int size;

    public void insertNode(E nodeValue) {
        Node<E> newNode = new Node<>(nodeValue);
        if(head == null) {
            newNode.next = null;
            head = newNode;
            tail = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
            size++;
        }
    }

    public void traversal() {
        Node<E> tempNode = head;
        for(int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if(i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
