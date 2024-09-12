package org.example;

import java.util.Scanner;

public class ErrorHandling {
    public int checkIntegerInput(String string, Scanner scanThis) {
        System.out.print(string);
        Scanner scanner = new Scanner(System.in);

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return checkIntegerInput(string, scanThis);
        }

    }
}
