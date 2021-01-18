package com.rk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9121523620422901838L;
	
	private Integer stdId;
	private String stdName;
	private Double stdFee;
}
