package org.example;

import java.util.*;

public class EventHandler {
    HashMap<UUID, String> ticketSold = new HashMap<UUID, String>();
    ErrorHandling errorHandling = new ErrorHandling();

    public void checkEvents(List<Event> events) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Events:");
        for(Event event : events) {
            System.out.println("Event Name: " + event.getEventName());
            System.out.println("Ticket Amount: " + event.getTicketAmount());
            System.out.println("Ticket Price: " + event.getTicketPrice());
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void buyTicket(List<Event> events) {
        String eventName = "";

        System.out.println("Buy Ticket");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Events Available:");
        int i = 0;
        for (Event event : events) {
            if (event.getTicketAmount() >= 1) {
                System.out.println(i + 1 + ". " + events.get(i).getEventName());
                i++;
            }
        }

        System.out.print("Enter event number: ");
        int eventNameInt = scanner.nextInt();

        switch (eventNameInt) {
            case 1:
                eventName = "Avicii Concert";
                break;
            case 2:
                eventName = "Tomorrowland";
                break;
            default:
        }

        String confirmation = errorHandling.checkStringInput("Are you sure you want to buy ticket for " + eventName + "? (Y/N) ", scanner);
        if (confirmation.equalsIgnoreCase("n")){
            System.out.println("Purchase cancelled.");
            System.out.println();
            return;
        }

        for (Event event : events) {
            if (event.getEventName().equals(eventName)) {
                if (event.getTicketAmount() >= 1) {
                    UUID uuid= UUID.randomUUID();

                    this.ticketSold.put(uuid, event.getEventName());

                    event.setTicketAmount(event.getTicketAmount() - 1);
                    System.out.println("Tickets purchased successfully.");
                    System.out.println();


                    System.out.println("Ticket Details:");
                    System.out.println("Ticket ID: " + uuid);
                    System.out.println("Event Name: " + event.getEventName());
                    System.out.println();
                } else {
                    System.out.println("Not enough tickets available.");
                }
                return;
            }
        }
        System.out.println("Event not found.");
    }

    public void checkTicketDetails(UUID uuid){
        String event = this.ticketSold.get(uuid);

        System.out.println("Ticket Details:");
        System.out.println("Ticket ID: " + uuid);
        System.out.println("Event Name: " + event);
        System.out.println();
    }

    public void listAllTicketBooked() {
        System.out.println("All Ticket Booked:");

        for (Map.Entry<UUID, String> entry : this.ticketSold.entrySet()) {
            System.out.println("Ticket ID: " + entry.getKey());
            System.out.println("Event Name: " + entry.getValue());
            System.out.println();
        }
    }
}
