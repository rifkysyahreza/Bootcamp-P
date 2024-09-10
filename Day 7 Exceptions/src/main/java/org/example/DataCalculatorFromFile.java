package org.example;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataCalculatorFromFile {
    public static void readCsv(String csvPath){
        File file = new File(csvPath);

        try {
            if (!file.exists()){
                throw new FileNotFoundException("File Not Found");
            }
            
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
