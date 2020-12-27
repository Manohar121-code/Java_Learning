package com.oops.inheritance;

public class FerrariMain {
	public static void main(String[] args) {
		Ferrari f1 = new Ferrari(101010);
		f1.setName("Ferrari");
		f1.setNumOfWheels(4);
		f1.setTopSpeed(250);
		f1.setType("2 stroke engine");
		
		System.out.println(f1);
		System.out.println(f1.getType());
		
	}
}
