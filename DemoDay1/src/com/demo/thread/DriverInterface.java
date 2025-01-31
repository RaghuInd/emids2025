package com.demo.thread;

import com.demo.entity.Employee;

public class DriverInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp =  new Employee(); // tight coupling
		
		Parent parent = new ParentImpl(); // loose coupling
		parent.a();
		parent.search("emids");
		
		Child child = new ChildImpl();
		child.a();
		child.b();
		Parent parentref = child;
		parentref.a();
		//parentref.b();
		parentref = parent;
		parentref.a();
		
	}

}
