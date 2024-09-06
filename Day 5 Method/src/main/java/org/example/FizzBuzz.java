package org.example;

import java.util.ArrayList;

public class FizzBuzz {
    public static void  operation(int howMuch){
        ArrayList<String> fizzBuzzInteger = new ArrayList<>();

        for (int i = 1; i <= howMuch; i++){
            if (i % 5 == 0 && i % 3 == 0){
                fizzBuzzInteger.add("FizzBuzz");
            } else if(i % 5 == 0){
                fizzBuzzInteger.add("Buzz");
            } else if(i % 3 == 0){
                fizzBuzzInteger.add("Fizz");
            }else {
                fizzBuzzInteger.add(Integer.toString(i));
            }
        }

        System.out.println(fizzBuzzInteger);
    }
}
