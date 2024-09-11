package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        UserImplementation user = new UserImplementation();
//        TicketGenerator ticketGenerator = new TicketGenerator();
//
//        System.out.println("Welcome to Ticket System");
//        System.out.print("Want to generate ticket first? (Y/N): ");
//        String generateTicket = scanner.next();
//        if (generateTicket.equalsIgnoreCase("Y")){
//            ticketGenerator.generateTicket();
//        }
//
//        // Choose the event
//        String event = user.chooseEvent(1);
//        System.out.println("You have chosen: " + event);
//
//        // Count the ticket available for the event
//        int ticketAvailable = user.countTicketAvailable(event);
//        if (ticketAvailable == 0) {
//            System.out.println("Ticket is not available");
//            return;
//        }
//        System.out.println("Ticket available: " + ticketAvailable);
//
//        // Buy ticket
//        System.out.print("Do you want to buy ticket? (Y/N): ");
//        String buyTicket = scanner.next();
//        if (buyTicket.equalsIgnoreCase("Y")){
//            user.buyTicket(event, 1);
//        }
//
//        // View ticket
//        user.viewTicket();

        TicketGenerator ticketGenerator = new TicketGenerator();
        ticketGenerator.generateTicket();

        TicketSystem ticketSystem = new TicketSystem();
         ticketSystem.getAviciiTickets();
    }
}