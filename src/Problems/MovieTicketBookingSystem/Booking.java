package Problems.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    int id;
    Show show;
    List<Seat>bookedSeats = new ArrayList<>();
    Payment payment;
}
