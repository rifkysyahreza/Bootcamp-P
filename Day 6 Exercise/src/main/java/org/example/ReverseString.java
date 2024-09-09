package org.example;

public class ReverseString {
    public static void reverse(String stringToReverse){
        char[] arrayOfChar = stringToReverse.toCharArray();
        for (int i = arrayOfChar.length - 1; i >= 0; i--) {
            System.out.print(arrayOfChar[i]);
        }
    }
}
