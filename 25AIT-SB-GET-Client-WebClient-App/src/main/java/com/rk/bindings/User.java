package com.rk.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class User {
	private Integer userId;
	private String userName;
	private String userEmail;
}

