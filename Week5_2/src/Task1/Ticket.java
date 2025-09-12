package Task1;

public class Ticket {
    private static int seatNumber = 1;
    private final int ticketSeatNumber;

    public Ticket () {
        this.ticketSeatNumber = seatNumber;
        seatNumber++;
    }
}
