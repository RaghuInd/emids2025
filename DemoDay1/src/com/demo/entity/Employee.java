package com.demo.entity;

public class Employee extends Object {

	private int id = 0;

	private String name;

	public Employee() {
		super();
		this.id = 1;
		this.name = "emids";
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

	public void fun1() {

	}

	public static void fun2() {

	}

}
