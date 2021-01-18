package com.rk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="STUDENT_DTLS")
@Data
public class Student {
	
	@Id
	@GeneratedValue
	private Integer sid;
	
	private String sname;
	
	private String marks;
}
