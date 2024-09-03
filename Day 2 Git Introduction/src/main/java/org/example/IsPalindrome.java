package org.example;

public class IsPalindrome {
    public static boolean isPali(String word){
        StringBuilder str = new StringBuilder(word);
        StringBuilder reversedstr = str.reverse();
        String reversedWord = reversedstr.toString();

        return reversedWord.equals(word);
    }
}
