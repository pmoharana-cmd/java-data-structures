package com.pmoha.tree.binary_tree.linked_list;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");

        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.deleteNode("N5");
        binaryTree.levelOrder();
        binaryTree.deleteBinaryTree();
        binaryTree.levelOrder();
    }
}
