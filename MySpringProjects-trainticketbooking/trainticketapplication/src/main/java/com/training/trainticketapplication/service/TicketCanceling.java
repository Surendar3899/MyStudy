package com.training.trainticketapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.training.trainticketapplication.domain.Ticket;
import com.training.trainticketapplication.domain.TicketStatus;
@Service
@Scope("prototype") // Ensure a new instance is created for each request
public class TicketCanceling {
     private int pnr;
    private int seats;

    @Autowired
    private TicketSystem ticketSystem;

    public TicketCanceling(int pnr, int seats) {
        this.pnr = pnr;
        this.seats = seats;
        //this.ticketSystem = TicketSystem.getInstance();
    }

    private void cancelTicket() {
        Ticket ticket = ticketSystem.getTicket(pnr);
        WaitingListManager waitingListManager = new WaitingListManager(); // may be useful in upcoming lines of code

        if(ticket != null) {
            // if ticket is in waiting list
            if(ticket.getTicketStatus() == TicketStatus.WaitingList) {
                waitingListManager.waitingListRemoval(pnr, seats, ticket);
                return;
            }
            // if in booked list this code executes
            int bookedSeats = ticket.getSeats();
            char source = ticket.getSource(), destination = ticket.getDestination();
            //partial cancellation
            if(bookedSeats > seats) {
                ticket.setSeats(bookedSeats - seats);
                ticketSystem.storePartiallyCanceledSeats(pnr, seats); // stores partially cancelled seats
                System.out.println("Partially cancelled pnr "+ pnr);
            }
            else {
                ticketSystem.processCancellation(pnr, ticket);
                System.out.println("Cancelled Ticket pnr "+ pnr);
            }
            ticketSystem.increaseSeatAvailability(source, destination, seats); // update how many seats are free
            waitingListManager.processWaitingList(); // check whether we can pick a ticket from waiting list
        }
        else {
            System.out.println("Ticket with pnr "+pnr+" not found");
        }
    }

    public void execute() {
        this.cancelTicket();
    }
}
