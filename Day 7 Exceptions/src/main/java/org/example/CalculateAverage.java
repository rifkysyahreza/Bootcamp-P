package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CalculateAverage {
    String regex = "^[0-9q]+$";
    Pattern pattern = Pattern.compile(regex);

    public void calculate(){
        Scanner scanner = new Scanner(System.in);


        int inputCounter = 0;
        double theNumber = 0;
        while (true){
            System.out.print("Input The Number: ");
            String inputFromUser = scanner.next();
            Matcher matcher = pattern.matcher(inputFromUser);

            if(!matcher.matches()){
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
                continue;
            }

            if (inputFromUser.equals("q")){
                System.out.println( theNumber / inputCounter);
                break;
            }

            theNumber += Double.parseDouble(inputFromUser);

            System.out.println(theNumber);
            System.out.println(inputCounter);
            System.out.println(inputFromUser);

            inputCounter++;
        }
    }
}
