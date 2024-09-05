package org.example;

import java.util.Enumeration;

public class Multiplier {
    private static int numberToMultiply;

    public Multiplier(int numberToMultiply){
        Multiplier.numberToMultiply = numberToMultiply;
    }

    public void theOperation(){
        for (int i = 1; i <= numberToMultiply; i++){
            for (int j = 1; j <= numberToMultiply; j++){
                System.out.print(i*j + "\t");
            }

            System.out.println();
        }

        System.out.println();
    }

}
