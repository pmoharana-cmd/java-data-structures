package com.pmoha.linked_list.interview_questions;

public class Node<E> {
    public E value;
    public Node<E> next;
    public Node<E> prev;

    public Node(E val) {
        this.value = val;
    }
}
