package Structural.facade;

import java.util.Random;

public class TicketSystem {

    private int ticketNumber;

    public boolean checkAvailability(String movie) {
        System.out.println("Checking availability for movie: " + movie);
        return true;
    }

    public void createTicket(int price, User user, String movie) {
        ticketNumber = new Random().nextInt(10000);

        System.out.println("Ticket created for " + user.getName());
        System.out.println("Movie: " + movie);
        System.out.println("Price: " + price);
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}
