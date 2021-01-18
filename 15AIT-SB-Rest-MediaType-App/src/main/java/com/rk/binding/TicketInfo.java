package com.rk.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
	private Integer ticketId;
	private String from;
	private String to;
	private String ticketPrice;
	private String pnrStatus;
	
}
