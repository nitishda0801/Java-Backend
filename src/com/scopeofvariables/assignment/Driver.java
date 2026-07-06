package com.scopeofvariables.assignment;
class Car{
	
	public static int finalPrice(int price) {
		int discout =10;
		return price - (price*10)/100;
	}
}
public class Driver {

	public static void main(String[] args) {
		
		System.out.println(Car.finalPrice(1000));

	}

}
