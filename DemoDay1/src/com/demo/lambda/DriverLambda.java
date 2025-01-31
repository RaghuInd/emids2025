package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DriverLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomFunction function = () -> System.out.println("Am lambda");
		function.display();

		Consumer<String> stringConsumer = (s) -> System.out.println(s);
		stringConsumer.accept("India");

		Consumer<Integer> intConsumer = (i) -> {
			System.out.println(i);
			System.out.println(i * i);

		};
		intConsumer.accept(5);

		Supplier<String> supplyComapanyName = () -> {
			return "Emids";
		};

		System.out.println(supplyComapanyName.get());

		Predicate<Integer> evenPredicate = (p) -> p % 2 == 0;
		System.out.println(evenPredicate.test(25));

		Function<String, String> toUpperFunction = (s) -> {
			return s.toUpperCase();
		};

		System.out.println(toUpperFunction.apply("india"));

		BiFunction<Integer, Integer, Double> powerFunction = (b, p) -> Math.pow(b, p);

		System.out.println(powerFunction.apply(5, 5));

		// Stream

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(3, "BB", 55000.0));
		employeeList.add(new Employee(10, "CC", 35000.0));
		employeeList.add(new Employee(2, "AA", 25000.0));
		employeeList.add(new Employee(22, "AA", 10000.0));
		System.out.println("emp list" + employeeList);

		// Filter
		// remove employees having salary > 50k
		employeeList.stream().filter((e) -> e.getSalary() > 50000.0).forEach((e) -> System.out.println(e));
		System.out.println("emp list" + employeeList);
		// Map
		// increase sal by 10%
		employeeList.stream().map((e) -> {
			e.setSalary(e.getSalary() * 1.1);
			return e;
		}).forEach((e) -> System.out.println(e));

		employeeList.stream().map((e) -> {
			e.setName(e.getName().toLowerCase());
			return e.getName(); // mapping to stream of names
		}).forEach((e) -> System.out.println(e));
		System.out.println(employeeList);
		// terminal collectors
		List<Employee> lowsalaryempList = employeeList.stream().filter((e) -> e.getSalary() < 50000.0)
				.collect(Collectors.toList());
		System.out.println("emp list" + lowsalaryempList);
		// sorting based on salary
		List<Employee> sortedEmployeeList = employeeList.stream()
				.sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).collect(Collectors.toList());
		System.out.println(sortedEmployeeList);

		// reduce
		// employeeList.clear();
		Optional<Double> totalSalaryOpt = employeeList.stream().map(e -> e.getSalary()).reduce((a, b) -> a + b);
		if (totalSalaryOpt.isPresent())
			System.out.println(totalSalaryOpt.get());
		totalSalaryOpt.ifPresent((d) -> System.out.println(d));

		// create a lambda that can return Optional of Boolean
		Optional<Integer> dataOpt = getValue();
		System.out.println(dataOpt);
		dataOpt.ifPresent((d) -> System.out.println(d));
	}
	// function that return optional

	public static Optional<Integer> getValue() {
		// my logic
		Integer data = 100;
		return Optional.of(data);
		// return Optional.empty();
	}

}
