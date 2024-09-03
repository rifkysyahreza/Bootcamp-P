package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObjDouble = new Scanner(System.in);

        // Solution 1
        System.out.print("Enter Farenheit: ");
        double farenheit = myObjDouble.nextDouble();
        double convertFarenheit = FarenheitToCelcius.calc(farenheit);
        System.out.println("Farenheit to Calcius: " + convertFarenheit);

        // Solution 2
        System.out.print("Enter Centimeter: ");
        double centimeter = myObjDouble.nextDouble();
        double convertCentimeter = CentimeterToKilometer.calc(centimeter);
        System.out.println("Cm to Km: " + convertCentimeter + " Km");

        // Solution 3
        System.out.print("Enter Number to Check: ");
        double number = myObjDouble.nextDouble();
        Boolean isEvenResult = IsEven.checkEven(number);
        System.out.println("Is the Number Even: " + isEvenResult);

        Scanner myObjString = new Scanner(System.in);

        // Solution 4
        System.out.print("Enter Base Word: ");
        String baseWord = myObjString.nextLine();
        RemoveSearchWord theWord = new RemoveSearchWord(baseWord);

        System.out.print("Enter Char to Delete: ");
        String charToDelete = myObjString.nextLine();
        String delResult = theWord.removeChar(charToDelete);
        System.out.println("Result: " + delResult);

        // Solution 5
        System.out.print("Enter Word: ");
        String word = myObjString.nextLine();
        Boolean isPaliResult = IsPalindrome.isPali(word);
        System.out.print("Is Palindrome: " + isPaliResult);

    }
}