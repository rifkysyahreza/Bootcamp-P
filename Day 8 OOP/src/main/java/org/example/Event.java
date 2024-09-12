package org.example;

public class Event {
    private String eventName;
    private int ticketAmount;
    private int ticketPrice;

    public Event( String eventName, int ticketAmount, int ticketPrice) {
        this.eventName = eventName;
        this.ticketAmount = ticketAmount;
        this.ticketPrice = ticketPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

}
