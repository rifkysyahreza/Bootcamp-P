package org.example;

public class RemoveSearchWord {
    private String baseString;

    public RemoveSearchWord(String baseString){
        this.baseString = baseString;
    }

    public String removeChar(String theChar){
        String newWord = baseString.replace(theChar, "");
        return newWord;
    }
}
