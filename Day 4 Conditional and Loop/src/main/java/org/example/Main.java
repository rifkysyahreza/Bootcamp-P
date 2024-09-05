package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObjInteger = new Scanner(System.in);
        Scanner myObjString = new Scanner(System.in);

        // Solution 1
        System.out.print("Enter Number: ");
        int numberToMultiply = myObjInteger.nextInt();
        Multiplier theResult = new Multiplier(numberToMultiply);
        theResult.theOperation();

        // Solution 2
        System.out.print("Enter Number of Tree Height: ");
        int treeHeightInput = myObjInteger.nextInt();
        Tree theTreeResult = new Tree(treeHeightInput);
        theTreeResult.theTree();

        // Solution 3
        MakeItStop stopIt = new MakeItStop();
        stopIt.stopItDude();

        // Solution 4
        GuessTheNumber play = new GuessTheNumber();
        play.guessTheNumber();

        // Solution 5
        System.out.print("Enter the Magic Word: ");
        String magicWordInput = myObjString.nextLine();
        MagicWord.castTheMagic(magicWordInput);
    }
}