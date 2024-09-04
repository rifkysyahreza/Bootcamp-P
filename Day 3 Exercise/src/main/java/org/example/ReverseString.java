package org.example;

import java.util.ArrayList;

public class ReverseString {
    public static String reverseWord(String wordToReverse){
        ArrayList<String> reversedChar = new ArrayList<>();
        for (int i = wordToReverse.length(); i > 0; i--){
            reversedChar.add(String.valueOf(wordToReverse.charAt(i-1)));
        }

        return String.join("", reversedChar);
    }
}
