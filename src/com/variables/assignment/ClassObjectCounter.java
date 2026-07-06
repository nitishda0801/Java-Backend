package com.variables.assignment;

public class ClassObjectCounter {
	public static int count=0;
	
	private int id;
	
	{//instance block used here for code resusibility & optimized code.
		count++;
	}
	public ClassObjectCounter() {
		super();
//		count++;
	}
	public ClassObjectCounter(int id) {
		this.id = id;
//		count++;
	}

	public static void main(String[] args) {
		
		ClassObjectCounter obj = new ClassObjectCounter();
		ClassObjectCounter obj1 = new ClassObjectCounter(1);
		ClassObjectCounter obj2 = new ClassObjectCounter(2);
		ClassObjectCounter obj3 = new ClassObjectCounter();
		ClassObjectCounter obj5 = new ClassObjectCounter(6);
		
		System.out.println("Total Object created: "+count);

	}

}
