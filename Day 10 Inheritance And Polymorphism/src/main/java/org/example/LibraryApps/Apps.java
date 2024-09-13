package org.example.LibraryApps;

import java.util.Scanner;

public class Apps {
    HomeUser homeUser = new HomeUser();
    Scanner scanner = new Scanner(System.in);
    ErrorHandler errorHandler = new ErrorHandler();
    LibrarySystem librarySystem = new LibrarySystem();
    boolean isLogin = false;
    String username = "";

    public void run() {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("++++++ Welcome to The App ++++++");
        System.out.println("++++++++++++++++++++++++++++++++");

        // Register First Then Login
        if(!isLogin){
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int menu = errorHandler.checkInt("Choose menu: ", scanner);
            switch (menu){
                case 1:
                    homeUser.register();
                    run();
                    break;
                case 2:
                    username = homeUser.login();
                    if(username.equalsIgnoreCase("credentialInvalid")){
                        run();
                    } else {
                        isLogin = true;
                    }

                    if (isLogin){
                        this.librarySystem = new LibrarySystem(username);
                        LibraryApps(username);
                    } else {
                        run();
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using this app");
                    break;
                default:
                    System.out.println("Invalid menu");
            }
        }

    }

    private void LibraryApps(String username){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("+++++ Welcome to Library App +++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("1. Borrow Material");
        System.out.println("2. Return Material");
        System.out.println("3. Checking Availability");
        System.out.println("4. Logout");
        int menu = errorHandler.checkInt("Choose menu: ", scanner);
        switch (menu){
            case 1:
                librarySystem.borrowed();
                LibraryApps(username);
                break;
            case 2:
                librarySystem.returned();
                LibraryApps(username);
                break;
            case 3:
                librarySystem.checkAvailability();
                LibraryApps(username);
                break;
            case 4:
                isLogin = false;
                System.out.println("Logout......");
                System.out.println("Redirected to login page");
                librarySystem.clearBorrowedDataList();
                run();
                break;
            default:
                System.out.println("Invalid menu");
        }
    }
}
