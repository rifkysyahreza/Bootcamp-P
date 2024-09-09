package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Solution 1
        ShiftAnArray.shiftItBro(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);

        // Solution 2
        boolean result = DuplicateChecker.checkDuplicate(new int[]{1, 2, 3, 4, 5, 1, 7, 8, 9, 10});
        System.out.println("is there any duplicate? "+result);

        // Solution 3
        RemoveDuplicate.removeIt(new int[]{1, 2, 2, 3, 3, 3, 4, 5});

        // Solution 3 Part 2
        ArraySortIncreaseAndDecrease.ascendingSort(new int[]{8, 7, 5, 2});
        ArraySortIncreaseAndDecrease.descendingSort(new int[]{8, 5, 7, 2});

        // Solution 4
        RemoveAllOccurences.removeAllElement(new int[]{1, 2, 1, 3, 5, 1 }, 1);

        // Solution 5
        ReverseString.reverse("Hello World");

        // Solution 6
        FindAllDuplicates.findAllDuplicateInArray(new int[]{1, 1, 2, 2, 3});

        // Solution 7
        NumberOfWaitingDays.arrayOfWaitingDays(new int[] {73,74,75,71,69,72,76,73});
    }
}