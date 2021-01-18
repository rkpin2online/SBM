package com.rk.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
	
	private String fname;
	private String lname;
	private String doj;
	private String trainNum;
	private String from;
	private String to;
}
