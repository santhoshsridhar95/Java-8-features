package com.streams;

import java.util.List;

public class Employee {
	int id;
	String name;
	int salary;
	List<String> citiesWorkedIn;
	
	
	public List<String> getCitiesWorkedIn() {
		return citiesWorkedIn;
	}
	public Employee(int id, String name, int salary, List<String> citiesWorkedIn) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.citiesWorkedIn = citiesWorkedIn;
	}
	public Employee(int id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.salary = i;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

			
	
}
