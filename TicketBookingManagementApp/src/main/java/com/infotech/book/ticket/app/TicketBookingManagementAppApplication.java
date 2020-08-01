package com.infotech.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner{
	
	@Autowired
	private TicketBookingService ticketBookingService;
	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		//TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService", TicketBookingService.class);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");
		
		ticketBookingService.createTicket(ticket);
		System.out.println("DataSoruce: "+dataSource);
		// TODO Auto-generated method stub
		
	}
}
