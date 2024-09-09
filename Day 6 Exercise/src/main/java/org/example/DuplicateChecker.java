package org.example;
import java.util.ArrayList;

public class DuplicateChecker {
    public static boolean checkDuplicate(int[] arrayOfNumber){
        for (int i = 0; i < arrayOfNumber.length; i++ ) {
            for (int j = i + 1; j < arrayOfNumber.length; j++) {
                if (arrayOfNumber[i] == arrayOfNumber[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
