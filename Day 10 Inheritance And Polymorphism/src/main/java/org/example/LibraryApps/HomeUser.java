package org.example.LibraryApps;

import java.util.HashMap;
import java.util.Scanner;

public class HomeUser implements User{
    private HashMap<String, String> users = new HashMap<>();
    private ErrorHandler errorHandler = new ErrorHandler();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void register() {
        System.out.println("===============");
        System.out.println("Register Here");
        System.out.println("===============");
        String registerUsername = errorHandler.checkString("Username: ", scanner);
        String registerPassword = errorHandler.checkString("Password: ", scanner);

        try {
            if (users.containsKey(registerUsername)){
                System.out.println("Username already exist");
                register();
            } else {
                users.put(registerUsername, registerPassword);
                System.out.println("Register success");
                System.out.println("Please login");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public String login() {
        System.out.println("===============");
        System.out.println("Login Here");
        System.out.println("===============");
        String loginUsername = errorHandler.checkString("Username: ", scanner);
        String loginPassword = errorHandler.checkString("Password: ", scanner);

        try {
            if (users.containsKey(loginUsername) && users.get(loginUsername).equals(loginPassword)){
                System.out.println("Login success");
                return loginUsername;
            } else {
                System.out.println("Username or password is wrong");
                return "credentialInvalid";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return "credentialInvalid";
        }
    }
}
