package TrainTicket;

public class TicketBooking {
    private char source;
    private char destination;
    private int seats;
    private TicketSystem ticketSystem;

    TicketBooking(char source, char destination, int seats) {
        System.out.println("TickeBooking >>>>>>>>");
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.ticketSystem = TicketSystem.getInstance();
        System.out.println("TickeBooking <<<<<<<<<<<<<<<<");
 
    }

    private void bookTicket() {
        if(ticketSystem.checkSeatAvailability(source, destination, seats)) {
            Ticket ticket = new Ticket(source, destination, seats, TicketStatus.Booked);
            int newPnr = ticket.getPnrNumber();
            ticketSystem.addToBookedTickets(newPnr, ticket);
            System.out.println("Ticket Booked! your PNR number is "+ newPnr);
            ticketSystem.decreaseSeatAvailability(source, destination, seats);
        }
        else {
            if(ticketSystem.seatsBooked + seats > 2) {
                System.out.println("No tickets available from " + source + " --> " + destination);
            }
            else {
                // move to waiting list
                WaitingListManager waitingListManager = new WaitingListManager();
                waitingListManager.waitingListEntry(source, destination, seats);
            }
        }
    }

    protected void execute() {
        this.bookTicket();
    }
}