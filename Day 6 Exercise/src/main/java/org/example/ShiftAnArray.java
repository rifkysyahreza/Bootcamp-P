package org.example;

import java.util.Arrays;

public class ShiftAnArray {
    public static void shiftItBro(int[] arrayOfInteger, int shiftBy){
        int[] tempArrayForShifting = new int[shiftBy];


        // Copy first "shiftBy" value from arrayOfInteger to tempArrayForShifting
        System.arraycopy(arrayOfInteger, 0, tempArrayForShifting, 0, shiftBy);

        // Move array from "shiftBY" + 1 until the end of the arrayOfInteger to the beginning of the arrayOfInteger
        for (int i = 0; i < arrayOfInteger.length - shiftBy; i++) {
            arrayOfInteger[i] = arrayOfInteger[i + shiftBy];
        }

        // Move tempArrayForShifting to the end of the arrayOfInteger
        for (int i = 0; i < shiftBy; i++) {
            arrayOfInteger[arrayOfInteger.length - shiftBy + i] = tempArrayForShifting[i];
        }

        System.out.println(Arrays.toString(arrayOfInteger));
    }
}
