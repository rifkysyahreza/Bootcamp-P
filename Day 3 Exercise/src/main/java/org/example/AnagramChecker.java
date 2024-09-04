package org.example;

import java.util.Arrays;

public class AnagramChecker {
    private String baseWords;

    public AnagramChecker(String stringOneToCheck){
        this.baseWords = stringOneToCheck;
    }

    public boolean check(String stringTwoToCheck){
        char[] charArrayBaseWords = baseWords.replaceAll("\\s", "").toCharArray();
        char[] charArrayWordToCheck = stringTwoToCheck.replaceAll("\\s", "").toCharArray();

        if (charArrayBaseWords.length != charArrayWordToCheck.length){
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < charArrayBaseWords.length; i++) {
            freq[charArrayBaseWords[i] - 'a']++;
            freq[charArrayWordToCheck[i] - 'a']--;
        }

        for (int frequency : freq) {
            if (frequency != 0) return false;
        }

        return true;
    }
}
