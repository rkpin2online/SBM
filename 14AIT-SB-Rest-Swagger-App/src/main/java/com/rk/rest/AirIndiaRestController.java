package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.request.PassengerInfo;
import com.rk.response.TicketInfo;

@RestController
public class AirIndiaRestController {
	
	@PostMapping(value = "/book",
			produces = {"application/json","application/xml"},
			consumes = {"application/json","application/xml"}
			)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		
		//TODO : Logic To Book Ticket
		
		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFname()+ " " + pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("Confirm");
		ticket.setTicketPrice("3000.00 INR");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
	}
}
