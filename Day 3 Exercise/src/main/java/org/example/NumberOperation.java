package org.example;

public class NumberOperation {
    public static int sumDigits(String numberInputInStringForSumDigits){
        if (numberInputInStringForSumDigits.matches("[a-zA-Z]*")){
            return 0;
        }

        String[] digitsInChar = numberInputInStringForSumDigits.split("(?<=.)");

        int result = 0;
        for (String s : digitsInChar) {
            result += Integer.parseInt(s);
        }

        return result;
    }

    public static boolean isPrime(double numberInputInInteger){
        for (int i = 2; i < numberInputInInteger; i++) {
            if((numberInputInInteger % i) == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findLargest(String numberInputInStringForLargest){
        if (numberInputInStringForLargest.matches("[a-zA-Z]*")){
            return 0;
        }

        String[] digitsInChar = numberInputInStringForLargest.split("(?<=.)");

        int largest = 0;
        for (String s : digitsInChar) {
            if (Integer.parseInt(s) > largest) {
                largest = Integer.parseInt(s);
            }
        }

        return largest;
    }
}
