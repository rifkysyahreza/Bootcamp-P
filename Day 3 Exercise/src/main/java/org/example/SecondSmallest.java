package org.example;

import java.util.Arrays;

public class SecondSmallest {
    public static int secondSmallest(String numberBeforeSortInString){
        if (numberBeforeSortInString.matches("[a-zA-Z]*")){
            return 0;
        }

        String[] numbersInChar = numberBeforeSortInString.split("(?<=.)");
        int[] numbersOfArray = new int[numbersInChar.length];
        for(int i = 0;i < numbersInChar.length;i++)
        {
            numbersOfArray[i] = Integer.parseInt(numbersInChar[i]);
        }

        Arrays.sort(numbersOfArray);
        return numbersOfArray[1];
    }
}
