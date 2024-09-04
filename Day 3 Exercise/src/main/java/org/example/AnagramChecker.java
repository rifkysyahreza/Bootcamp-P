package org.example;

import java.util.Arrays;

public class AnagramChecker {
    private String baseWords;

    public AnagramChecker(String stringOneToCheck){
        this.baseWords = stringOneToCheck;
    }

    public boolean check(String stringTwoToCheck){
        char[] charArrayBaseWords = baseWords.toCharArray();
        char[] charArrayWordToCheck = stringTwoToCheck.toCharArray();

        Arrays.sort(charArrayBaseWords);
        Arrays.sort(charArrayWordToCheck);

        return Arrays.equals(charArrayBaseWords, charArrayWordToCheck);
    }
}
