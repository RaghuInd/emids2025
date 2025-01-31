package com.example.demo.wallet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class WalletTransaction {

	@Id
	@GeneratedValue
	private Integer id;
	private Double amount;
	private String type;
	public WalletTransaction() {
		super();
	}
	public WalletTransaction(Double amount, String type) {
		super();
		
		this.amount = amount;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
