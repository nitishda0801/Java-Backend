package com.variables.assignment;

public class Student {
	public static String schoolName;
	private String name;
	private int roll;
	private int marks;

	public Student(String name, int roll, int marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public static void main(String[] args) {
		
//		Student.schoolName = "NKS public School";
		schoolName = "NKS public School";

		
		Student st = new Student("Nitish", 33, 89);
		Student st1 = new Student("Monu", 23, 68);
		Student.showStudentDetails(st);
		Student.showStudentDetails(st1);
		

	}
	public static void showStudentDetails(Student st) {
		
		System.out.println("Student Details:");
		System.out.println("School name : "+schoolName);
		System.out.println("Name : "+st.name);
		System.out.println("Roll : "+st.roll);
		System.out.println("Marks : "+st.marks);
		
		
	}
}
