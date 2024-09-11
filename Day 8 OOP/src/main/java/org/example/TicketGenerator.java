package org.example;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.UUID;

public class TicketGenerator {
    private final File FILE_PATH = new File("src/main/java/org/example/TicketAvailable.csv");
    private final String HEADER = "UUID,Event Name,Price";
    private final String[] EVENT = {"Avicii Concert", "Tomorrowland", "Electric Daisy Carnival"};

    private String generateUUID() {
        return UUID.randomUUID().toString();
    }

    // Generate a new ticket
    public void generateTicket() {

        FileWriter fr = null;
        int numberOfTicket = 10;
        try {
            fr = new FileWriter(FILE_PATH);
            fr.write(HEADER);

            TicketSystem ticketSystem = new TicketSystem();
            while (numberOfTicket > 0) {
                Ticket ticket = new Ticket(generateUUID(), EVENT[new Random().nextInt(EVENT.length)], 1000);
                ticketSystem.addTicket(ticket);

                fr.write("\n" + ticket.getUUID() + "," + ticket.getEventName() + "," + ticket.getPrice());
                numberOfTicket--;
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                if( fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
