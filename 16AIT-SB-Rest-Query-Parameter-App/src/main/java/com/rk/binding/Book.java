package com.rk.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {
	
	private String isbn;
	private String bookName;
	private String bookPrice;
	
}
