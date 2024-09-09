package org.example;

public class ArraySortIncreaseAndDecrease {
    public static void ascendingSort(int[] arrayOfNumberInput){
        int size = arrayOfNumberInput.length;

        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (arrayOfNumberInput[j] > arrayOfNumberInput[j + 1]) {
                    int temp = arrayOfNumberInput[j];
                    arrayOfNumberInput[j] = arrayOfNumberInput[j + 1];
                    arrayOfNumberInput[j + 1] = temp;
                }
            }

        }

        System.out.println("Array in ascending order: " + java.util.Arrays.toString(arrayOfNumberInput));
    }

    public static void descendingSort(int[] arrayOfNumberInput){
        int size = arrayOfNumberInput.length;

        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (arrayOfNumberInput[j] < arrayOfNumberInput[j + 1]) {
                    int temp = arrayOfNumberInput[j];
                    arrayOfNumberInput[j] = arrayOfNumberInput[j + 1];
                    arrayOfNumberInput[j + 1] = temp;
                }
            }

        }

        System.out.println("Array in descending order: " + java.util.Arrays.toString(arrayOfNumberInput));
    }
}
