package org.example;

import java.util.ArrayList;

public class NumberOfWaitingDays {
    public static void arrayOfWaitingDays(int[] arrayOfDegree){
        ArrayList<Integer> listOfWaitingDays = new ArrayList<>();

        int days = 1;
        int lastDays = arrayOfDegree[0];
        for (int i = 0; i < arrayOfDegree.length; i++){

            if( i == arrayOfDegree.length - 1){
                listOfWaitingDays.add(0);
                break;
            }

            if (lastDays < arrayOfDegree[i+1]){
                listOfWaitingDays.add(days);

                lastDays = arrayOfDegree[i];
                days = 1;
            }

            if(lastDays > arrayOfDegree[i+1]){
                days++;
            }

        }

        System.out.println("List of waiting days: " + listOfWaitingDays);
    }
}
