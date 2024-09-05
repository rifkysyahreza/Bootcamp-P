package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheNumber {
    Scanner myObjInteger = new Scanner(System.in);
    ArrayList<Integer> attempt = new ArrayList<>();

    private static final int theMightyNumber = (int)(Math.random() * 10);

    public void guessTheNumber(){
        boolean status = true;

        while (status){
            System.out.print("Guess The Number: ");
            int guessedNumber = myObjInteger.nextInt();

            if (guessedNumber < theMightyNumber){
                System.out.println("Too Low!");
                attempt.add(guessedNumber);
            } else if (guessedNumber > theMightyNumber){
                System.out.println("Too High!");
                attempt.add(guessedNumber);
            } else {
                System.out.println("Congratulations! You Guess the Right Number");
                attempt.add(guessedNumber);
                System.out.println("Your Total Attempt: " + attempt.size());
                status = false;
            }
        }

    }
}
