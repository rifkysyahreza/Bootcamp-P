package org.example;

import java.util.ArrayList;

public class AddToTarget {
    public static void indexToAdd(String numberToTarget,int target){
        String[] arrayOfNumberInString = numberToTarget.split(",");
        ArrayList<Integer> indexToTarget = new ArrayList<>();

        for (int i = 0; i < arrayOfNumberInString.length; i++){
            for (int j = 0; j < arrayOfNumberInString.length -1; j++){
                if (indexToTarget.size() == 2){
                    break;
                }

                if (Integer.parseInt(arrayOfNumberInString[i]) + Integer.parseInt(arrayOfNumberInString[j]) == target){
                    indexToTarget.add(i);
                    indexToTarget.add(j);
                }
            }
        }

        if (indexToTarget.size() < 2){
            System.out.println("No Pair Exist");
        } else {
            System.out.println(indexToTarget);
        }

    }
}
