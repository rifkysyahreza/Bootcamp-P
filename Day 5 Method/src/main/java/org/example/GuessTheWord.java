package org.example;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheWord {
    Random randomNumber = new Random();
    private String[] WORDS = {"Hang", "Man"};
    private String randomWord = WORDS[randomNumber.nextInt(WORDS.length - 1)].toLowerCase();
    ArrayList<String> arrayOfUnderscore = new ArrayList<>();

    private void guessAttempt(){
        Scanner scanner = new Scanner(System.in);

        int count = randomWord.length();

        while (count > 0){


            System.out.println("Guess This Word: " + String.join("", arrayOfUnderscore));
            System.out.println("Attempt Left: " + count);
            System.out.print("Try The Letter: ");
            String wordPart = scanner.nextLine();

            // check if the letter exist
            if (randomWord.contains(wordPart)){
                int indexOfCorrectLetter = randomWord.indexOf(wordPart);
                arrayOfUnderscore.set(indexOfCorrectLetter, wordPart);
            } else {
                System.out.println("Wrong Letter");
            }

            // check if the letter completed
            if (randomWord.toLowerCase().equals(String.join("", arrayOfUnderscore))){
                System.out.println("Congrats! The Word is: " + String.join("", arrayOfUnderscore));
                break;
            }

            count--;

            if (count == 0){
                System.out.println("You Lose");
            }
        }

    }

    public void play(){
        for (int i = 0; i < randomWord.length(); i++){
            arrayOfUnderscore.add("_");
        }
        guessAttempt();
    }
}
