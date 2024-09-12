package org.example.Apps;

import java.util.Scanner;

public class Apps {
    HomeUser homeUser = new HomeUser();
    Scanner scanner = new Scanner(System.in);
    ErrorHandler errorHandler = new ErrorHandler();
    ToDoSystem toDoSystem = new ToDoSystem();
    boolean isLogin = false;
    String username = "";

    public void run() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("+++++ Welcome to Todo App +++++");
        System.out.println("+++++++++++++++++++++++++++++++");

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
                        toDoApp(username);
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

    public void toDoApp(String username){
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Add Todo");
        System.out.println("2. View Todo");
        System.out.println("3. Delete Todo");
        System.out.println("4. Logout");
        System.out.println("5. Exit");
        int menu = errorHandler.checkInt("Choose menu: ", scanner);
        switch (menu){
            case 1:
                toDoSystem.addTodo(username);
                toDoApp(this.username);
                break;
            case 2:
                toDoSystem.viewTodo(username);
                toDoApp(this.username);
                break;
            case 3:
                toDoSystem.deleteTodo(username);
                toDoApp(this.username);
                break;
            case 4:
                isLogin = false;
                System.out.println("Logout......");
                System.out.println("Redirected to login page");
                toDoSystem.clearToDoListPreviousUser();
                run();
                break;
            case 5:
                System.out.println("Thank you for using this app");
                break;
            default:
                System.out.println("Invalid menu");
        }
    }
}
