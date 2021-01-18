package com.rk.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Book {
	
	private Integer bookId;
	private String bookName;
	private String bookPrice;
	
}
