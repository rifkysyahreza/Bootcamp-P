package org.example;

public class Queue {
    Node head;

    // Constructor, initialize head to null
    public Queue() {
        this.head = null;
    }

    // Enqueue data to queue
    public void enqueue(int data) {
        Node newNode = new Node(data); // Create new node

        // Check if queue is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head; // Traverse to last node

        // Traverse to last node
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode; // Point last node to new node
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue data from queue
    public void dequeue() {
        // Check if queue is empty
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(head.data + " dequeued from queue");
        head = head.next; // Set next node as head
    }

    // Peek front element of queue
    public void peek() {

        // Check if queue is empty
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is " + head.data);
    }
}
