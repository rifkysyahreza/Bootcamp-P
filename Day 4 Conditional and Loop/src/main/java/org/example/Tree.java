package org.example;

public class Tree {
    public static int treeHeight;

    public Tree(int treeHeightInput){
        Tree.treeHeight = treeHeightInput;
    }

    public void theTree() {
        for (int i = 0; i < treeHeight; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
