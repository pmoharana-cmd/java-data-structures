package com.pmoha.tree.binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private BinaryNode insert(BinaryNode currNode, int value) {
        if(currNode == null) {
            System.out.println("The value has successfully inserted!");
            return new BinaryNode(value);
        } else if(value <= currNode.value) {
            currNode.left = insert(currNode.left, value);
            return currNode;
        } else {
            currNode.right = insert(currNode.right, value);
            return currNode;
        }
    }

    public void insert(int value) {
        if(root == null) {
            root = new BinaryNode(value);
        } else {
            insert(root, value);
        }
    }

    public void preOrder(BinaryNode currNode) {
        if(currNode == null) {
            return;
        }
        System.out.print(currNode.value + " ");
        preOrder(currNode.left);
        preOrder(currNode.right);
    }

    public void inOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int value) {
        if(node == null) {
            System.out.println("Value: " + value + " not found in BST!");
            return null;
        } else if(node.value == value) {
            System.out.println("Value: " + value + " found in BST!");
            return node;
        } else if(value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public BinaryNode minimumNode(BinaryNode root) {
        if(root.left == null) {
            return null;
        } else {
            return minimumNode(root.left);
        }
    }

    public BinaryNode deleteNode(BinaryNode root, int value) {
        if(root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if(value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if(value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if(root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minimum = minimumNode(temp.right);
                root.value = minimum.value;
                root.right = deleteNode(root.right, minimum.value);
            } else if(root.left != null) {
                root = root.left;
            } else if(root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted!");
    }
}
