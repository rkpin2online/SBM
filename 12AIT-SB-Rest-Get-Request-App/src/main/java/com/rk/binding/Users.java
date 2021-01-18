package com.rk.binding;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Users {
	
	private List<User> user;
}
