package org.example;

public class FindAllDuplicates {
    public static void findAllDuplicateInArray (int[] arrayOfNumber){
        for (int i = 0; i < arrayOfNumber.length; i++) {
            for (int j = i + 1; j < arrayOfNumber.length; j++) {
                if (arrayOfNumber[i] == arrayOfNumber[j]) {
                    System.out.println("Duplicate element: " + arrayOfNumber[j]);
                }
            }
        }
    }
}
