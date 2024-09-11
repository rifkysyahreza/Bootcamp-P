package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserImplementation implements UserAccess {
    Scanner scanner = new Scanner(System.in);
    private File file = new File("src/main/java/org/example/TicketAvailable.csv");


    @Override
    public String chooseEvent(int eventNumber) {
        try {
            System.out.print("Enter the event number: ");
            int event = scanner.nextInt();

            return switch (event) {
                case 1 -> "Avicii Concert";
                case 2 -> "Tomorrowland";
                case 3 -> "Electric Daisy Carnival";
                default -> throw new Exception("Invalid event number");
            };

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        return "";
    }

    @Override
    public void buyTicket(String event, int ticketNumber) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }

            int ticketAvailable = countTicketAvailable(event);
            if (ticketAvailable == 0) {
                System.out.println("Ticket is not available");
                return;
            }


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void viewTicket() {

    }

    public int countTicketAvailable(String event) {
        int count = 0;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }

            Scanner scanner = new Scanner(file);
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] ticket = scanner.nextLine().split(",");
                if (ticket[1].equals(event)) {
                    count++;
                }

            }

            return count;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }
}
