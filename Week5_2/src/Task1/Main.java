package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> allCustomers = new ArrayList<>();
        int ticketCount = 30;
        int customerCount = 20;
        for (int i = 0; i < ticketCount; i++) {
            TicketsList.TICKETS.add(new Ticket());
        }

        for (int i = 0; i < customerCount; i++) {
            allCustomers.add(new Customer());
        }

        for (Customer c : allCustomers) {
            c.start();
        }

    }
}
