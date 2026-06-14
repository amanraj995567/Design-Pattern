package Structural.facade;

public class NotificationSystem {

    public void email(User user, int ticketNumber) {
        System.out.println("Email sent to " + user.getEmail() +
                " for ticket " + ticketNumber);
    }

    public void sms(User user, int ticketNumber) {
        System.out.println("SMS sent to " + user.getPhone() +
                " for ticket " + ticketNumber);
    }
}