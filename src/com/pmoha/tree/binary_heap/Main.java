package com.pmoha.tree.binary_heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(5, "MAX");
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(1);
        heap.levelOrder();
        heap.extract();
        heap.levelOrder();
        heap.deleteBH();
    }
}
