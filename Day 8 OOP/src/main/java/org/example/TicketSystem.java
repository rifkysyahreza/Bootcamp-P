package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class TicketSystem {
    private ArrayList<Ticket> aviciiTickets = new ArrayList<>();
    private Stack<Ticket> tomorrowlandTickets = new Stack<>();
    private Stack<Ticket> electricDaisyTickets = new Stack<>();

    public void addTicket(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket cannot be null");
        }

        switch (ticket.getEventName()) {
            case "Avicii Concert" -> {
                aviciiTickets.add(ticket);
                System.out.println("Added to Avicii Concert: " + ticket);
            }
            case "Tomorrowland" -> {
                tomorrowlandTickets.add(ticket);
                System.out.println("Added to Tomorrowland: " + ticket);
            }
            case "Electric Daisy Carnival" -> {
                electricDaisyTickets.add(ticket);
                System.out.println("Added to Electric Daisy Carnival: " + ticket);
            }
            default -> throw new IllegalArgumentException("Unknown event: " + ticket.getEventName());
        }
    }

    public void getAviciiTickets() {
        System.out.println("Avicii Tickets: " + aviciiTickets.toString());
    }

    public Stack<Ticket> getTomorrowlandTickets() {
        return tomorrowlandTickets;
    }

    public Stack<Ticket> getElectricDaisyTickets() {
        return electricDaisyTickets;
    }

}
