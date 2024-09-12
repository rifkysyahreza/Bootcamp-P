package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Apps {
    private List<Event> events = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    EventHandler eventHandler = new EventHandler();
    ErrorHandling errorHandling = new ErrorHandling();

    public Apps(){
        this.events.add(new Event("Avicii Concert", 100, 1000));
        this.events.add(new Event("Tomorrowland", 100, 1000));
    }

    public void run() {
        System.out.println("Welcome to Ticketing System");
        System.out.println("1. Check Events");
        System.out.println("2. Buy Ticket");
        System.out.println("3. Check Ticket Details");
        System.out.println("4. List All Ticket Booked");
        System.out.println("5. Exit");

        System.out.println();

        int choice = errorHandling.checkIntegerInput("Choose: ", scanner);
        switch (choice) {
            case 1:
                eventHandler.checkEvents(this.events);
                run();
                break;
            case 2:
                eventHandler.buyTicket(this.events);
                run();
                break;
            case 3:
                System.out.print("Enter Ticket ID: ");
                UUID uuid = java.util.UUID.fromString(scanner.next());
                eventHandler.checkTicketDetails(uuid);
                run();
                break;
            case 4:
                eventHandler.listAllTicketBooked();
                run();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                run();
        }
    }
}
