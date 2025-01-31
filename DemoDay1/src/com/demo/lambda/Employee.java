package com.demo.lambda;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Object implements Comparable<Employee> { // natural order

	private int id;
	private String name;
	private Double salary;
	private LocalDate dob;
	

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
