package com.rk.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8656358196063532549L;
	
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSal;
}
