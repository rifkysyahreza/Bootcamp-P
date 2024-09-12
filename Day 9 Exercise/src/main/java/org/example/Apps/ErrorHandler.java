package org.example.Apps;

import java.util.Scanner;

public class ErrorHandler {
    private final String ALPHABET_NUMBER_COMBINATION = "[a-zA-Z0-9]+";

    // Check if the input is an integer
    public int checkInt(String text, Scanner scanner){
        System.out.print(text);
        scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e){
            System.out.println("Please input number");
            return checkInt(text, scanner);
        }

    }

    // Check if the input is a string with alphabet and number only
    public String checkString(String text, Scanner scanner){
        System.out.print(text);
        scanner = new Scanner(System.in);

        if (scanner.hasNext(ALPHABET_NUMBER_COMBINATION)){
            return scanner.next();
        } else {
            System.out.println("Please input alphabet and number only");
            return checkString(text, scanner);
        }
    }

}
