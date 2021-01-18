package com.rk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STOCK_PRICE_TAB")
public class StockPrice {
	
	@Id
	@GeneratedValue
	@Column(name = "PRICE_ID_COL")
	private Integer stockPriceId;
	
	@Column(name = "COMP_NAME_COL")
	private String companyName;
	
	@Column(name = "STOCK_COST_COL")
	private Double stockCost;
}
