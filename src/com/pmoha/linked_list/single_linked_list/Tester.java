package com.pmoha.linked_list.single_linked_list;

public class Tester {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insert(10, 100);
        linkedList.insert(4, 1);
        linkedList.insert(6, 2);
        linkedList.insert(1, 3);
        linkedList.insert(59, 1);
        linkedList.insert(12, 1);
        linkedList.traverseSinglyLinkedList();
        linkedList.search(1);
        linkedList.deleteSLL();
        linkedList.traverseSinglyLinkedList();
    }
}
