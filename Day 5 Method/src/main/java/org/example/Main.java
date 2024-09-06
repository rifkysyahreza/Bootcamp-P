package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Solution 1
//        GuessTheWord guessGame = new GuessTheWord();
//        guessGame.play();

        // Solution 2

//        // Solution 3
//        System.out.print("Enter Your Array of Number: "); // use comma after each number ex: 1,2,3,4,5,6
//        String stringOfArrayNumber = scanner.nextLine();
//        OddNumberRemover.removeTheOdd(stringOfArrayNumber);

//        // Solution 4
//        System.out.print("Enter Number: ");
//        int howMuch = scanner.nextInt();
//        FizzBuzz.operation(howMuch);

        // Solution 5
        System.out.print("Enter Number to Target: ");
        String numberToTarget = scanner.nextLine();

        System.out.print("Enter Target Number: ");
        int target = scanner.nextInt();
        AddToTarget.indexToAdd(numberToTarget, target);

    }

}