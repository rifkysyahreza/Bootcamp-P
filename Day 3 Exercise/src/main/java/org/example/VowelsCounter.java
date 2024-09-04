package org.example;

public class VowelsCounter {
    public static int countVowels(String wordToCountVowels){
        wordToCountVowels = wordToCountVowels.toLowerCase();
        int count = 0;

        for (int i = 0; i < wordToCountVowels.length(); i++){
            if (wordToCountVowels.charAt(i) == 'a' || wordToCountVowels.charAt(i) == 'i' || wordToCountVowels.charAt(i) == 'u' || wordToCountVowels.charAt(i) == 'e' || wordToCountVowels.charAt(i) == 'o'){
                count++;
            }
        }

        return count;
    }
}
