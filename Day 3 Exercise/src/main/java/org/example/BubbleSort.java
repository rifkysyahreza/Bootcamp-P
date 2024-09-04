package org.example;

public class BubbleSort {
    public static void bubbleSort(int[] arrayOfNumber){
        int size = arrayOfNumber.length;

        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (arrayOfNumber[j] > arrayOfNumber[j + 1]) {
                    int temp = arrayOfNumber[j];
                    arrayOfNumber[j] = arrayOfNumber[j + 1];
                    arrayOfNumber[j + 1] = temp;
                }
            }

        }

    }
}
