package com.hellokoding.datastructure;

public class BSTByLinkedList {
    public Node root;

    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data <= node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public void insert(int data) {
        this.root = insert(this.root, data);
    }

    public void inTraversal(Node node) {
        if (node == null) return;

        inTraversal(node.left);
        System.out.println(node.data);
        inTraversal(node.right);
    }

    public static void main(String[] args) {
        BSTByLinkedList binarySearchTree = new BSTByLinkedList();
        binarySearchTree.insert(7);
        binarySearchTree.insert(1);
        binarySearchTree.insert(9);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);

        binarySearchTree.inTraversal(binarySearchTree.root);
    }

    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}

