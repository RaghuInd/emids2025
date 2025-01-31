package com.example.demo.wallet;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Wallet { // POJO : simple plain Old Java Object [will not have any business logic]

	@Id

	private Integer id;

	private String name;
	private Double balance;

	@OneToOne
	private Address address; // HAS-A relation

	@OneToMany
	private List<WalletTransaction> transactions = new ArrayList<>();

	public Wallet() {
		super();
	}

	public Wallet(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Wallet(Integer id, String name, Double balance, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
	}

	public Wallet(Integer id, String name, Double balance, Address address, List<WalletTransaction> transactions) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.transactions = transactions;
	}

	public List<WalletTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<WalletTransaction> transactions) {
		this.transactions = transactions;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
