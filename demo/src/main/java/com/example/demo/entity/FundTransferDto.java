package com.example.demo.entity;

public class FundTransferDto {//POJO
	
	private Integer id;
	private Double fund;
	
	public FundTransferDto() {
		super();
	}
	public FundTransferDto(Integer id, Double fund) {
		super();
		this.id = id;
		this.fund = fund;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getFund() {
		return fund;
	}
	public void setFund(Double fund) {
		this.fund = fund;
	}
	

}
