package org.example;

public interface UserAccess {
    String chooseEvent(int eventNumber);
    void buyTicket(String event, int ticketNumber);
    void viewTicket();
}
