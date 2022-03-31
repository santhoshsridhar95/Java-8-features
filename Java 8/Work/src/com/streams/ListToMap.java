package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "John",80000));
		list.add(new Employee(2, "Jack", 90000));
		list.add(new Employee(3, "Ricky", 120000));

		// key = id, value - name
		Map<Integer, String> result = list.stream().collect(
		Collectors.toMap(Employee::getId, Employee::getName));

		// key = id, value - "ABC"
		Map<Integer, Employee> result1 = list.stream().collect(
		Collectors.toMap(Employee::getId,emp->emp));
		
		
		System.out.println(result1);
		
		for (Entry entry : result1.entrySet()) {
			System.out.println(entry.getKey() +"->"+entry.getValue());
			Employee e = (Employee) entry.getValue();
			System.out.println(e.getId() +"->"+e.getName());
		}
		
		System.out.println("\n\n");
		
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "John",80000,Arrays.asList("Pune","Blore","Mumbai")));
		list1.add(new Employee(2, "Jack", 90000,Arrays.asList("Pune","Blore")));
		list1.add(new Employee(3, "Ricky", 120000,Arrays.asList("Jaipur","Blore","Chennai")));
		
		final int i=0;
//		List<List<String>> cityWorked = list1.stream().map(e->e.citiesWorkedIn).collect(Collectors.toList());
//		 list1.stream().flatMap(e->e.citiesWorkedIn.stream()).collect(Collectors.toSet()).forEach(System.out::println);
		list1.stream().collect(Collectors.toMap(e->e.getId(), e->e.toString().replace("[","").replace("]","")))
		.forEach((k,v)->{
			System.out.println(k +" -> "+v);
		});
		
		
//		System.out.println(cityWorked);
	}
}
