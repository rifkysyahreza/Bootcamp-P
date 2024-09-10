package org.example;

public class Main {
    public static void main(String[] args) {

//        // Solution 1
//        CalculateAverage result = new CalculateAverage();
//        result.calculate();

        // Solution 2
        DataCalculatorFromFile result = new DataCalculatorFromFile();
        result.readCsv("D:\\Belajar\\Purwadhika\\Project\\Day 7 Exceptions\\src\\main\\java\\org\\example\\sales.csv");
    }

}