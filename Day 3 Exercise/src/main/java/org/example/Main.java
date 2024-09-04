package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObjDouble = new Scanner(System.in);
        Scanner myObjString = new Scanner(System.in);

        // Solution 1
        System.out.print("Enter Number to SumDigits: ");
        String sumDigitsInString = myObjString.nextLine();
        int resSumDigits = NumberOperation.sumDigits(sumDigitsInString);
        System.out.println("The sum is: " + resSumDigits);

        // Solution 2
        System.out.print("Enter Number to Check Prime: ");
        double numInputToCheck = myObjDouble.nextDouble();
        boolean resCheckPrime = NumberOperation.isPrime(numInputToCheck);
        System.out.println("Is the Number Prime: " + resCheckPrime);

        // Solution 3
        System.out.print("Enter Number to Find the Largest: ");
        String findLargestInString = myObjString.nextLine();
        int resFindLargest = NumberOperation.findLargest(findLargestInString);
        System.out.println("The Largest is: " + resFindLargest);

        // Solution 4
        System.out.print("Enter The Number and Operand: ");
        String stringOfNumberAndOperand = myObjString.nextLine();
        double resultOperand = SimpleCalculator.doTheCalc(stringOfNumberAndOperand);
        System.out.println("The Result of Operand: " + resultOperand);

        // Solution 5
        System.out.print("Enter Word to Reverse: ");
        String wordToReverse = myObjString.nextLine();
        String resWordToReverse = ReverseString.reverseWord(wordToReverse);
        System.out.println("Reversed String is: " + resWordToReverse);

        // Solution 6
        System.out.print("Enter How Much Fibonacci Sequence: ");
        int numHowMuchFibonacci = myObjDouble.nextInt();
        Fibonacci.theSequence(numHowMuchFibonacci);

        // Solution 7
        System.out.print("Enter Word to Count Vowels: ");
        String wordToCountVowels = myObjString.nextLine();
        int resVowelsCounter  = VowelsCounter.countVowels(wordToCountVowels);
        System.out.println("Sum of Vowels From the Word: " + resVowelsCounter);

        // Solution 8

        // Solution 9
        System.out.print("Enter the Base Word: ");
        String stringOneToCheck = myObjString.nextLine();
        AnagramChecker theWord = new AnagramChecker(stringOneToCheck);

        System.out.print("Enter the Check Word: ");
        String stringTwoToCheck = myObjString.nextLine();
        boolean resultAnagram = theWord.check(stringTwoToCheck);
        System.out.println("Is the Two Word Anagram: " + resultAnagram);

        // Solution 10
        System.out.print("Enter Number to Find 2nd Smallest: ");
        String numberBeforeSortInString = myObjString.nextLine();
        int resultSecondSmallest = SecondSmallest.secondSmallest(numberBeforeSortInString);
        System.out.println("The Second Smallest: " + resultSecondSmallest);

    }
}