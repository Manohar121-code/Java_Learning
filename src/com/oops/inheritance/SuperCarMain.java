package com.oops.inheritance;

public class SuperCarMain {
	public static void main(String[] args) {
		SuperCar s1 = new SuperCar();
		s1.setMileage(10);
		s1.setName("SuperCar1");
		s1.setPrice(1010100);
		
		System.out.println(s1.getMileage());
		System.out.println(s1.getName());
		System.out.println(s1.getPrice());
	}
}
