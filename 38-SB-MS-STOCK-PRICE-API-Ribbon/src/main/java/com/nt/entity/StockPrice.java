package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STOCK_PRICE")

public class StockPrice {
	@Id
	@Column(name = "PRICE_ID")
	private Integer stockPriceId;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "STOCK_COST")
	private Double stockCost;

}
