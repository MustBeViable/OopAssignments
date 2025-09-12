package Task1;

public class TicketReserveSystem {
    public static synchronized boolean reserveTicket(int count, Customer c) {
        if (TicketsList.TICKETS.isEmpty() || TicketsList.TICKETS.size() < count) {
            return false;
        } else {
            for (int i = 0; i < count; i++) {
                Ticket t = TicketsList.TICKETS.get(0);
                TicketsList.TICKETS.remove(t);
                c.addTicket(t);
            }
            return true;
        }
    }
}
