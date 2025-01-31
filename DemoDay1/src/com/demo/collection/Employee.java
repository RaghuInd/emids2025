package com.demo.collection;

import java.util.Objects;

public class Employee extends Object implements Comparable<Employee>{ // natural order

	private int id;

	private String name;


	@Override
	public int compareTo(Employee e2) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(e2.getId());
	}
	
	public Employee() {
		super();
	}

	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}




}
