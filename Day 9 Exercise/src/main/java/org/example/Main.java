package org.example;

import org.example.Apps.Apps;

public class Main {
    public static void main(String[] args) {
        try {
            Apps app = new Apps();
            app.run();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}