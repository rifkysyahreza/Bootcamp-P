package org.example;
import java.util.ArrayList;

public class RemoveDuplicate {
    public static void removeIt(int[] arrayOfNumber){
        ArrayList<Integer> removedDuplicate = new ArrayList<>();

        for (int i : arrayOfNumber) {
            if (removedDuplicate.contains(i)) {
                continue;
            }

            removedDuplicate.add(i);
        }

        System.out.println("Array without duplicate: " + removedDuplicate);
    }
}
