package com.pmoha.tree.binary_tree.linked_list;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
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

    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if(currNode.value.equals(value)) {
                System.out.println("The value-" + value + "-is found in tree!");
                return;
            }
            if(currNode.left != null) {
                queue.add(currNode.left);
            }
            if(currNode.right != null) {
                queue.add(currNode.right);
            }
        }
        System.out.println("Value not in tree!");
    }

    public void insert(String value) {
        BinaryNode tempNode = new BinaryNode(value);
        if(root == null) {
            System.out.println("Inserted Node at the root!");
            root = tempNode;
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if(currNode.left != null) {
                queue.add(currNode.left);
            } else {
                currNode.left = tempNode;
                System.out.println("Successfully inserted!");
                return;
            }
            if(currNode.right != null) {
                queue.add(currNode.right);
            } else {
                currNode.right = tempNode;
                System.out.println("Successfully inserted!");
                return;
            }
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.remove();
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        BinaryNode prevNode = null;

        while(!queue.isEmpty()) {
            prevNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null) {
                prevNode.right = null;
                return;
            }
            else if(presentNode.right == null) {
                prevNode.left = null;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if(presentNode.value.equals(value)) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node is deleted!");
                return;
            } else {
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                } if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The node does not exist in this BT!");
    }

    public void deleteBinaryTree() {
        root = null;
        System.out.println("Tree has been successfully deleted!");
    }
}
