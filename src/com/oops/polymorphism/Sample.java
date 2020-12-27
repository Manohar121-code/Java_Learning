package com.oops.polymorphism;

public class Sample {

	public void m1() {
		System.out.println("m1 called");
	}
	
	public void m1(int i) {
		System.out.println("m1 called and i value - "+ i);
	}
	
	public void m1(String s) {
		System.out.println("m1 called and s value - "+ s);
	}
	
	public void m1(int i, String s) {
		System.out.println("m1 called and i value - "+ i +" and s value - "+ s);
	}
}
