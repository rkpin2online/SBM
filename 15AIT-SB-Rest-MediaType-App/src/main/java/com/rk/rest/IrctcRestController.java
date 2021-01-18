package com.rk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.binding.PassengerInfo;
import com.rk.binding.TicketInfo;

@RestController
public class IrctcRestController {
	
	@PostMapping(value = "/book",consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		
		//TODO :
		
		TicketInfo ticket = new TicketInfo();
		ticket.setTicketId(12345);
		ticket.setPnrStatus("CNF");
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketPrice("500.00 INR");
		
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
	}
}
