package org.example.LibraryApps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {
    Scanner scanner = new Scanner(System.in);
    ErrorHandler errorHandler = new ErrorHandler();
    HashMap<String, String[]> borrowedData = new HashMap<>();
    ArrayList<String> borrowedDataList = new ArrayList<>();
    Books books = new Books();
    DVD dvd = new DVD();
    String username = "";

    public LibrarySystem(String username){
        this.username = username;
    }

    public LibrarySystem(){
    }

    void borrowed(){
        System.out.println("What is borrowed this time?");
        System.out.println("1. Books");
        System.out.println("2. DVD");

        int menuBorrow = errorHandler.checkInt("Choose from menu: ", scanner);
        switch (menuBorrow){
            case 1:
                if (books.getAvailable() == 0){
                    System.out.println("Books are not available");
                    break;
                }

                books.borrowMaterial();
                borrowedDataList.add(books.getMaterialName());
                borrowedData.put(username, borrowedDataList.toArray(new String[0]));
                checkBorrowedData();
                System.out.println("Books available: " + books.getAvailable());;
                break;
            case 2:
                if (dvd.getAvailable() == 0){
                    System.out.println("DVD are not available");
                    break;
                }

                dvd.borrowMaterial();
                borrowedDataList.add(dvd.getMaterialName());
                borrowedData.put(username, borrowedDataList.toArray(new String[0]));
                checkBorrowedData();
                System.out.println("DVD available: " + dvd.getAvailable());
                break;
            default:
                System.out.println("Invalid menu");
        }

    }

    void returned(){
        System.out.println("What is returned this time?");
        System.out.println("1. Books");
        System.out.println("2. DVD");

        int menuReturn = errorHandler.checkInt("Choose from menu: ", scanner);
        switch (menuReturn){
            case 1:
                returnOneMaterial(books);
                checkReturnedData("Books");
                break;
            case 2:
                returnOneMaterial(dvd);
                checkReturnedData("DVD");
                break;
            default:
                System.out.println("Invalid menu");
        }
    }

    void checkBorrowedData(){
        System.out.println("Borrowed data: ");
        borrowedData.forEach((key, value) -> System.out.println("Username: " + key + ", You've Borrowed: " + Arrays.toString(value)));
    }

    void checkReturnedData(String materialName){
        System.out.println("Returned data: ");
        System.out.println("Username: " + username + ", You've Returned: " + materialName);
    }

    void checkAvailability(){
        System.out.println("Books available: " + books.getAvailable());
        System.out.println("Books borrowed: " + (10 - books.getAvailable()));
        System.out.println("DVD available: " + dvd.getAvailable());
        System.out.println("DVD borrowed: " + (5 - dvd.getAvailable()));
    }

    void returnOneMaterial(LibraryMaterials materialName){
        for (String material : borrowedDataList){
            if (material.equalsIgnoreCase(materialName.getMaterialName())){
                borrowedDataList.remove(material);
                materialName.returnMaterial();
                System.out.println(materialName.getMaterialName() + " has been returned");
                break;
            }
        }
    }

    void clearBorrowedDataList(){
        borrowedDataList.clear();
    }
}
