package org.example;
import java.util.ArrayList;

public class RemoveAllOccurences {
    public static void removeAllElement(int[] arrayOfNumberInputed, int theKeyToRemove){
        ArrayList<Integer> arrayAfterRemove = new ArrayList<>();

        for (int i : arrayOfNumberInputed) {
            if (i == theKeyToRemove) {
                continue;
            }

            arrayAfterRemove.add(i);
        }

        System.out.println(arrayAfterRemove);
    }
}
