package com.variables.cw;
class Company{
	static String companyName = "TCS";
}
class Employee extends Company{
	
	String name = "Nitish";
	int age =25;
	String dept = "IT";
	
}
public class Driver {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println("Company: "+emp.companyName);
		System.out.println("Emp Name: "+emp.name);
		System.out.println("Age: "+emp.age);
		System.out.println("Dept: "+emp.dept);
		
		
		

	}

}
