package org.example;
import java.util.ArrayList;

public class MagicWord {
    public static void castTheMagic(String magicWordInput){
        ArrayList<String> arrayOfMagicChar = new ArrayList<String>();

        for (char ch : magicWordInput.toCharArray()){
            if (Character.isUpperCase(ch)){
                arrayOfMagicChar.add(Character.toString(ch ^ 0x20));
            } else if (Character.isLowerCase(ch)) {
                arrayOfMagicChar.add(Character.toString(ch & 0x5f));
            }else {
                arrayOfMagicChar.add(Character.toString(ch));
            }
        }

        System.out.println(String.join("", arrayOfMagicChar));
    }
}
