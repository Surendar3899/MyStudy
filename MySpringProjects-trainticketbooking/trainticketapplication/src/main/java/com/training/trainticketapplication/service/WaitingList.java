package com.training.trainticketapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.training.trainticketapplication.domain.Ticket;
import com.training.trainticketapplication.domain.TicketStatus;


@Service
@Scope("prototype")
public class WaitingList {

    @Autowired
    ApplicationContext context;

    @Autowired
    TicketSystem ticketSystem;

     private char source;
    private char destination;
    private int seats;

    WaitingList(char source, char destination, int seats) {
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        //this.ticketSystem = TicketSystem.getInstance();
    }

    private void addToWaitingList() {
        //Ticket ticket = context.getBean(Ticket.class,source,destination,seats,TicketStatus.WaitingList);
        Ticket ticket = new Ticket(source,destination,seats,TicketStatus.WaitingList);
        int pnrNumber = ticket.getPnrNumber();
        ticketSystem.waitingList.put(pnrNumber, ticket);
        ticketSystem.seatsBooked += seats;

        System.out.println("Added to Waiting List with pnr number "+pnrNumber);
    }

    protected void execute() {
        this.addToWaitingList();
    }
}
