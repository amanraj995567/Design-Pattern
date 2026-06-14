package Structural.facade;

public class Main {
    public static void main(String[] args) {
        User user = new User("Aman" , "aman@gmail.com", "99667785756");
        // here we are hiding complex logic of ticket booking from client using facade pattern
       BookingFacade bookingFacade = new BookingFacade();
       bookingFacade.createBooking(user);
    }
}
