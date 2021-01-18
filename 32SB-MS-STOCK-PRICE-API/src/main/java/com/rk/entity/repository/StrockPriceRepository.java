package com.rk.entity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.StockPrice;

public interface StrockPriceRepository extends JpaRepository<StockPrice, Serializable> {
	
	public StockPrice findByCompanyName(String companyName);
}
