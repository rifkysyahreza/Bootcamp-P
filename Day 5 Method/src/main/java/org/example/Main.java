package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solution 1
        GuessTheWord guessGame = new GuessTheWord();
        guessGame.play();

        // Solution 2
        System.out.print("Enter the Amount: ");
        double amountOfMoney = scanner.nextDouble();
        System.out.print("Currency From (USD,EUR,GBP, or JPY): ");
        String currencyFrom = scanner.next();
        System.out.print("Currency To (USD,EUR,GBP, or JPY): ");
        String currencyTo = scanner.next();
        double convertResult = CurrencyConverter.convert(amountOfMoney,currencyFrom,currencyTo);
        System.out.println(convertResult);

        // Solution 3
        System.out.print("Enter Your Array of Number: "); // use comma after each number ex: 1,2,3,4,5,6
        String stringOfArrayNumber = scanner.next();
        OddNumberRemover.removeTheOdd(stringOfArrayNumber);

        // Solution 4
        System.out.print("Enter Number: ");
        int howMuch = scanner.nextInt();
        FizzBuzz.operation(howMuch);

        // Solution 5
        System.out.print("Enter Number to Target: "); // use comma after each number ex: 1,2,3,4,5,6
        String numberToTarget = scanner.next();

        System.out.print("Enter Target Number: ");
        int target = scanner.nextInt();
        AddToTarget.indexToAdd(numberToTarget, target);

    }

}