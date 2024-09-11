package org.example;

import java.math.BigDecimal;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataCalculatorFromFile {
    private Scanner scanner;
    private double totalSales;
    private int totalProductSold;
    private String mostBoughtProduct;
    private String leastBoughtProduct;

    public void readCsv(String csvPath){
        File file = new File(csvPath);

        try {
            if (!file.exists()){
                throw new FileNotFoundException("File Not Found");
            }

            this.scanner = new Scanner(file);

            getData();
            showData();

            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("There's a wrong format in some line");
        }
    }

    private void getData() throws NumberFormatException {

        int mostBoughtProductSoldTemp = 0;
        String mostBoughtProductTemp = "";
        int leastBoughtProductSoldTemp = 0;
        String leastBoughtProductTemp = "";

        // Loop for each line in file
        while (scanner.hasNextLine()){

            // ["item name", "sold", "price"]
            String[] arrayOfStringThisLine = scanner.nextLine().split(",");

            // Assign item sold and item price
            int itemSold = Integer.parseInt(arrayOfStringThisLine[1]);
            double itemPrice = Double.parseDouble(arrayOfStringThisLine[2]);

            // Calculate and assign total sales and total product sold
            totalSales += itemSold * itemPrice;
            totalProductSold += itemSold;
            
            // Check if this product is sold more than previous product
            if (itemSold > mostBoughtProductSoldTemp){
                mostBoughtProductSoldTemp = itemSold;
                mostBoughtProductTemp = arrayOfStringThisLine[0];
            }

            // Check if this product is sold less than previous product or the previous is 0 [first initial]
            if (itemSold < leastBoughtProductSoldTemp || leastBoughtProductSoldTemp == 0){
                leastBoughtProductSoldTemp = itemSold;
                leastBoughtProductTemp = arrayOfStringThisLine[0];
            }
        }

        mostBoughtProduct = mostBoughtProductTemp;
        leastBoughtProduct = leastBoughtProductTemp;

    }

    private void showData(){
        System.out.printf("Total Sales: " + "%.2f%n", new BigDecimal(totalSales));
        System.out.println("Total Product Sold: " + totalProductSold);
        System.out.println("Most Bought Product: " + mostBoughtProduct);
        System.out.println("Least Bought Product: " + leastBoughtProduct);
    }
}
