package com.pmoha.tree.binary_heap;

public class BinaryHeap {
    private int arr[];
    private int sizeOfTree;
    private String heapType;

    public BinaryHeap(int size, String heapType) {
        this.arr = new int[size + 1];
        this.sizeOfTree = 0;
        this.heapType = heapType.toUpperCase();
        System.out.println("Binary Heap has been created!");
    }

    public boolean isEmpty() {
        return sizeOfTree == 0;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Binary Heap is Empty!");
            return -1;
        } else {
            return arr[1];
        }
    }

    public int getSize() {
        return sizeOfTree;
    }

    public void levelOrder() {
        for(int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapifyBottomToTop(int index) {
        int parent = index / 2;
        if(index <= 1) {
            return;
        }
        if(heapType.equals("MIN")) {
            if(arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        else if(heapType.equals("MAX")) {
            if(arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }

        heapifyBottomToTop(parent);
    }

    public void heapifyTopToBottom(int index) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if(sizeOfTree < left) {
            return;
        }
        if(heapType.equals("MAX")) {
            if(sizeOfTree == left) {
                if(arr[index] < arr[sizeOfTree]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                 if(arr[left] > arr[right]) {
                     swapChild = left;
                 } else {
                     swapChild = right;
                 }
                 if(arr[index] < arr[swapChild]) {
                     int temp = arr[index];
                     arr[index] = arr[swapChild];
                     arr[swapChild] = temp;
                 }
            }
        } else if(heapType.equals("MIN")) {
            if(sizeOfTree == left) {
                if(arr[index] > arr[sizeOfTree]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                System.out.println("ran");
                if(arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if(arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild);
    }

    public void insert(int value) {
        if(sizeOfTree == arr.length - 1) {
            System.out.println("Binary Heap is full!");
        } else {
            arr[sizeOfTree + 1] = value;
            sizeOfTree++;
            heapifyBottomToTop(sizeOfTree);
            System.out.println("Inserted " + value + " successfully in Binary Heap!");
        }
    }

    public int extract() {
        if(isEmpty()) {
            System.out.println("Binary Heap is empty!");
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1);
            return extractedValue;
        }
    }

    public void deleteBH() {
        arr = null;
        sizeOfTree = 0;
        System.out.println("Binary Heap has been successfully deleted!");
    }

}
