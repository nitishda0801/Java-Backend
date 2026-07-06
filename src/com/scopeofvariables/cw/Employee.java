package com.scopeofvariables.cw;

public class Employee {

	private String name;
	private int id;
	private int salary;
	

	public Employee(String name, int id, int salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee("Nitish", 1, 25000);
		emp.setSalary(118000);
		System.out.println("Emp Details:");
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		

	}

}
