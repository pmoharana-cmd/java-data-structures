package com.pmoha.linked_list.single_linked_list;

public class SinglyLinkedList<E> {
    public Node<E> head;
    public Node<E> tail;
    public int size;

    public SinglyLinkedList() {
        size = 0;
    }

    public Node<E> insert(E data, int index) {
        Node<E> node = new Node<>(data);
        if(head == null) {
            head = node;
            tail = node;
        } else if(index == 0) {
            node.next = head;
            head = node;
        } else if(index >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node<E> currNode = head;
            for(int i = 0; i < index - 1; i++) {
                currNode = currNode.next;
            }
            node.next = currNode.next;
            currNode.next = node;
        }
        size++;
        return node;
    }

    public void traverseSinglyLinkedList() {
        if(head == null) {
            System.out.println("Singly Linked List does not exist!");
        } else {
            Node<E> tempNode = head;
            for(int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public boolean search(E nodeValue) {
        if(head == null) {
            return false;
        }
        Node<E> tempNode = head;
        for(int i = 0; i < size; i++) {
            if(tempNode.value == nodeValue) {
                System.out.println("Found node at index " + i);
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Node not found!");
        return false;
    }

    public void delete(int index) {
        if(head == null) {
            System.out.println("Singly Linked List does not exist!");
        } else if(index == 0) {
            head = head.next;
            size--;
            if(size == 0) {
                tail = null;
            }
        } else if(index >= size) {
            Node<E> tempNode = head;
            for(int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head) {
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node<E> tempNode = head;
            for(int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("Singly Linked List deleted successfully");
        size = 0;
    }
}
