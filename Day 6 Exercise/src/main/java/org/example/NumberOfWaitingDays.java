package org.example;

import java.util.ArrayList;

public class NumberOfWaitingDays {
    public static void arrayOfWaitingDays(int[] arrayOfDegree){
        ArrayList<Integer> listOfWaitingDays = new ArrayList<>();

        int days = 1;
        for (int i = 0; i < arrayOfDegree.length; i++){

            // Check is this iteration is the last iteration
            if( i == arrayOfDegree.length - 1){
                listOfWaitingDays.add(0);
            }

            for (int j = i +1; j < arrayOfDegree.length; j++){

                // Check if the next value is bigger than the current value
                if (arrayOfDegree[i] < arrayOfDegree[j]){
                    listOfWaitingDays.add(days);
                    days = 1;
                    break;
                }

                // Check if the next value is lower than the current value
                if (arrayOfDegree[i] > arrayOfDegree[j]){

                    // Check if this value is bigger than next value and this iteration is the last iteration
                    if (j == arrayOfDegree.length - 1){
                        listOfWaitingDays.add(0);
                    }
                    days++;
                }

            }

        }

        System.out.println("List of waiting days: " + listOfWaitingDays);
    }
}
