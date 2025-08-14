package com.training.trainticketapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.training.trainticketapplication.domain.Ticket;
import com.training.trainticketapplication.domain.TicketStatus;

@Component
@Scope("prototype") // Ensure a new instance is created for each request
public class TicketBooking {

    private char source;
    private char destination;
    private int seats;

    @Autowired
    private TicketSystem ticketSystem;

    @Autowired
    private WaitingListManager waitingListManager;

    @Autowired
    private ApplicationContext context;

    // Constructor without @Autowired since it's not a bean lifecycle management
    public TicketBooking(char source, char destination, int seats) {
        this.source = source;
        this.destination = destination;
        this.seats = seats;
    }

    private void bookTicket() {
        System.out.println("Called bookTicket");
        if (ticketSystem.checkSeatAvailability(source, destination, seats)) {
            Ticket ticket = context.getBean(Ticket.class, source, destination, seats, TicketStatus.Booked);
            int newPnr = ticket.getPnrNumber();
            ticketSystem.addToBookedTickets(newPnr, ticket);
            System.out.println("Ticket Booked! Your PNR number is " + newPnr);
            ticketSystem.decreaseSeatAvailability(source, destination, seats);
        } else {
            if (ticketSystem.seatsBooked + seats > 2) {
                System.out.println("No tickets available from " + source + " --> " + destination);
            } else {
                waitingListManager.waitingListEntry(source, destination, seats);
            }
        }
    }

    public void execute() {
        this.bookTicket();
    }
}
