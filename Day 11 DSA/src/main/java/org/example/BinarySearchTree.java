package org.example;

public class BinarySearchTree {
    Node root; // Root node of the binary search tree

    public BinarySearchTree() {
        this.root = null; // Initialize the root to null
    }

    public void insert(int data) {
        root = insertRec(root, data); // Insert data into the tree
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data); // Create a new node if the current node is null
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data); // Recursively insert data into the left subtree
        } else if (data > root.data) {
            root.right = insertRec(root.right, data); // Recursively insert data into the right subtree
        }

        return root; // Return the (possibly new) root node
    }

    public int search(int data) {
        return searchRec(root, data); // Search for data in the tree
    }

    public int searchRec(Node root, int data) {
        if (root == null) {
            return 0; // Return 0 if the data is not found
        }

        if (root.data == data) {
            return 1; // Return 1 if the data is found
        }

        if (root.data < data) {
            return searchRec(root.right, data); // Recursively search in the right subtree
        }

        return searchRec(root.left, data); // Recursively search in the left subtree
    }

    public void preorder() {
        preorderRec(root); // Perform a preorder traversal of the tree
    }

    public void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " "); // Print the data of the current node
            preorderRec(root.left); // Recursively traverse the left subtree
            preorderRec(root.right); // Recursively traverse the right subtree
        }
    }

}
