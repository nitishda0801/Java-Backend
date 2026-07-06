package com.variables.code;

public class StaticVariable {

	static int balance = 100;
	
	public static void main(String[] args) {
		
		System.out.println(balance);//we can write this as JVM will provide to access.
		System.out.println(StaticVariable.balance);

	}

}
