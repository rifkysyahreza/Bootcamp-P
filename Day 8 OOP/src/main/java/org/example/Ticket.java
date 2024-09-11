package org.example;

public class Ticket {
    private String UUID;
    private String eventName;
    private int price;

    public Ticket(String UUID, String eventName, int price) {
        this.UUID = UUID;
        this.eventName = eventName;
        this.price = price;
    }

    public String setUUID(String UUID) {
        this.UUID = UUID;
        return UUID;
    }

    public String getUUID() {
        return UUID;
    }

    public String setEventName(String eventName) {
        this.eventName = eventName;
        return eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public int getPrice() {
        return price;
    }
}
