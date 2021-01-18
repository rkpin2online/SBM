package com.rk.response;

import lombok.Data;

@Data
public class TicketInfo {
	
	private String name;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String ticketPrice;
	private String ticketStatus;
}
