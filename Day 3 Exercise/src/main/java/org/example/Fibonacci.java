package org.example;

public class Fibonacci {
    public static void theSequence(int howMuchSequence){
        int numOne = 0;
        int numTwo = 1;

        for (int i = 0; i < howMuchSequence; i++) {
            System.out.print(numOne + " ");

            int numThree = numTwo + numOne;
            numOne = numTwo;
            numTwo = numThree;
        }

        System.out.println();
    }


}
