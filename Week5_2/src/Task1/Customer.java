package Task1;

import java.util.ArrayList;
import java.util.Random;

public class Customer extends Thread {
    private static int customerIndex = 1;
    private final String name;
    private final ArrayList<Ticket> tickets = new ArrayList<>();

    public Customer() {
        this.name = "Customer " + customerIndex;
        customerIndex++;
    }


    public void addTicket(Ticket t) {
        this.tickets.add(t);
    }

    @Override
    public void run() {
        Random rand = new Random();
        int tickedCount = (rand.nextInt(9)+1);
        boolean check = TicketReserveSystem.reserveTicket(tickedCount, this);
            if (!check) {
                System.out.println(this.name + " could not reserve " + tickedCount + " tickets.");
            } else {
                System.out.println(this.name + " reserved " + tickedCount + " tickets.");
            }
        }

}
