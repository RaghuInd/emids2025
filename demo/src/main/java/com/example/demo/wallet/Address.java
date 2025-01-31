package com.example.demo.wallet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer doorNo;
	private String street;
	private String pin;
	
	public Address() {
		super();
	}
	public Address(Integer doorNo, String street, String pin) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.pin = pin;
	}
	public Integer getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
