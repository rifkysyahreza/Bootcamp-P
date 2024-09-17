package org.example;

public class Stack {
    Node top;

    // Constructor, initialize top to null
    public Stack() {
        this.top = null;
    }

    // Push data to stack
    public void push(int data) {
        Node newNode = new Node(data); // Create new node
        newNode.next = top; // Point new node to top
        top = newNode; // Set new node as top
        System.out.println(data + " pushed to stack");
    }

    // Pop data from stack
    public int pop() {

        // Check if stack is empty
        if (top == null) {
            System.out.println("Stack is empty");
            return 0;
        }

        int dataToPop = top.data; // Get data to pop
        top = top.next; // Set next node as top
        System.out.println(dataToPop + " popped from stack");
        return dataToPop;
    }

    // Peek top element of stack
    public void peek() {

        // Check if stack is empty
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is " + top.data);
    }
}
