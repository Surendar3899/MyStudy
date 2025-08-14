package com.training.trainticketapplication;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.training.trainticketapplication.service.TicketBooking;
import com.training.trainticketapplication.service.TicketCanceling;
import com.training.trainticketapplication.service.TicketSystem;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class Main implements CommandLineRunner {


    // @Autowired
	// TicketBooking ticketBooking;


    
    @Autowired
    private ApplicationContext context;

    @Autowired
    TicketSystem ticketSystem;


    @Override
	public void run(String... args) throws Exception {
            System.out.println("run called");
            log.info("dnjnjd");
            while(true) {
                System.out.println(" 1. Book Ticket\n 2. Cancel Ticket\n 3. Print chart\n Choose any one");
                Scanner sc =  new Scanner(System.in);
                int option = sc.nextInt();
    
                switch(option) {
                    case 1:
                        System.out.println("Enter the source : ");
                        char source = sc.next().charAt(0);
                        System.out.println("Enter the destination : ");
                        char destination = sc.next().charAt(0);
                        System.out.println("Enter no of seats to book : ");
                        int seats = sc.nextInt();
    
                        if(source != destination) {
                            TicketBooking booking = context.getBean(TicketBooking.class, source, destination, seats);
                            booking.execute();

                        }
                        else {
                            System.out.println("I handled this scenario. Try again");
                        }
                        break;
                    
                    case 2:
                        System.out.println("Enter the pnr number : ");
                        int pnr = sc.nextInt();
                        System.out.println("Enter no of seats to cancel : ");
                        int seats1 = sc.nextInt();
                        log.info("sds");
                        TicketCanceling canceling = context.getBean(TicketCanceling.class,pnr,seats1);
                        canceling.execute();
                        break;
                    
                    case 3:
                        //TicketSystem.getInstance().printChart();
                        ticketSystem.printChart();
                        break;
                    
                    default:
                        System.out.println("Unfortunately Stopped!!");
                        break;
                    
                }
            }
    }
}
