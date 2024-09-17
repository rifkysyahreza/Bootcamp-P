package org.example;

public class Node {
    int data;
    Node next;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.left = null;
        this.right = null;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
}
