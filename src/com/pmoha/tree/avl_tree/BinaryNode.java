package com.pmoha.tree.avl_tree;

public class BinaryNode {
    public int value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(int val) {
        this.value = val;
        this.height = 0;
    }
}
