package com.demo.collection;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName()); // our logic

	}

	//(e1,e2)->e1.getName().compareTo(e2.getName());
}
