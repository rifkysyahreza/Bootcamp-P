package org.example;

import java.util.ArrayList;

public class OddNumberRemover {
    public static void removeTheOdd(String stringOfArrayNumber){
        String[] arrayOfNumberInString = stringOfArrayNumber.split(",");
        ArrayList<Integer> onlyEvenNumber = new ArrayList<>();

        for (String i : arrayOfNumberInString){
            int arrayItemInInteger = Integer.parseInt(i);

            if (arrayItemInInteger % 2 == 0){
                onlyEvenNumber.add(arrayItemInInteger);
            }
        }

        System.out.println(onlyEvenNumber);
    }

}
