package Structural.facade;

public class BookingFacade {
    public void createBooking(User user){
         TicketSystem ts = new TicketSystem();
         PaymentSystem ps = new PaymentSystem();
         NotificationSystem ns= new NotificationSystem();
        boolean isBookingPossible = ts.checkAvailability("movie");
        if(isBookingPossible){
            ts.createTicket(100, user, "movie");
            ps.chargeCard();
            ns.email(user, ts.getTicketNumber());
            ns.sms(user , ts.getTicketNumber());
        }
    }
}
