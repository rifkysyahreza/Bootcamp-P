package org.example;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheWord {
    ArrayList<String> arrayOfUnderscore = new ArrayList<>();
    private String randomWord;

    private void randomWordGenerator(){
        Random randomNumber = new Random();
        String[] WORDS = {"Hang", "Man", "Method"};

        arrayOfUnderscore.clear();
        randomWord = WORDS[randomNumber.nextInt(WORDS.length)].toLowerCase();
    }

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
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        while (status){
            randomWordGenerator();

            for (int i = 0; i < randomWord.length(); i++){
                arrayOfUnderscore.add("_");
            }
            guessAttempt();

            System.out.print("Do You Want to Play Again? (y/n): ");
            String yesOrNo = scanner.next();

            if(yesOrNo.equalsIgnoreCase("n")){
                status = false;
            }
        }

    }
}