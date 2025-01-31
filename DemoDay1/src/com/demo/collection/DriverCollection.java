package com.demo.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class DriverCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> integerList = new ArrayList<Integer>(); // static typing 
		integerList.add(5);
		integerList.add(55);
		integerList.add(15);
		integerList.add(-5);
		System.out.println("list:"+integerList);
		integerList.add(1, 99);
		System.out.println("list:"+integerList);
		integerList.remove(2);
		System.out.println("list:"+integerList);
		//Arrays.so
		Collections.sort(integerList);
		System.out.println("list:"+integerList);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(3, "BB"));
		employeeList.add(new Employee(10, "CC"));
		employeeList.add(new Employee(2, "AA"));
		employeeList.add(new Employee(22, "AA"));
		System.out.println("emp list" + employeeList);
		
		Collections.sort(employeeList);// uses natural ordering i.e comparable
		
		System.out.println("emp list" + employeeList);
		
		//Collections.sort(employeeList,new EmployeeNameComparator());
		//System.out.println("emp list" + employeeList);
		
		// SET
		Set<Double> doubleSet = new HashSet<>();
		
		doubleSet.add(5.5);
		doubleSet.add(2.5);
		doubleSet.add(1.5);
		System.out.println(doubleSet.add(1.5));
		System.out.println(doubleSet);
	
		Set<Employee> employeeSet = new HashSet<Employee>(employeeList);
		System.out.println(employeeSet);
		employeeSet.add(new Employee(22, "ZZ"));
		System.out.println(employeeSet);
		
		//Set<Employee> sortedEmployee = new TreeSet<Employee>(new EmployeeNameComparator());
		
		//Set<Employee> sortedEmployee = new TreeSet<Employee>((e1,e2)->e1.getName().compareTo(e2.getName()));
		Comparator<Employee> employeeComparator = (e1,e2)->e1.getName().compareTo(e2.getName());
		Set<Employee> sortedEmployee = new TreeSet<Employee>(employeeComparator);
				
		sortedEmployee.addAll(employeeSet);
		System.out.println(sortedEmployee);
		
		Map<Integer,String> directory = new HashMap<>();
		directory.put(3, "India");
		directory.put(7, "USA");
		directory.put(0, "UK");
		directory.put(10, null);
		directory.put(null, null);
		
		
		System.out.println(directory);
		directory.put(10, "Japan");
		System.out.println(directory);
		Map<Integer,Employee> employeeMap = new HashMap<>();
		employeeMap.put(2, new Employee(2, "DD"));
		employeeMap.put(6, new Employee(6, "FF"));
		employeeMap.put(9, new Employee(9, "AA"));
		employeeMap.put(55, new Employee(55, "DD"));
		System.out.println(employeeMap);
		System.out.println(employeeMap.get(6));
		System.out.println(employeeMap.remove(9));
		System.out.println(employeeMap);
		
		NavigableMap<Integer, Employee> sortedEmployeeMap = new TreeMap<>(employeeMap);
		System.out.println(sortedEmployeeMap);
		sortedEmployeeMap.put(3, new Employee(3, "India"));
		
		System.out.println(sortedEmployeeMap);
		System.out.println(sortedEmployeeMap.keySet());
		System.out.println(sortedEmployeeMap.values());	
		
		
	}

}
