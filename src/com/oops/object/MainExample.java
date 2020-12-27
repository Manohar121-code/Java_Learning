package com.oops.object;

public class MainExample {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1);
		Sample s2 = new Sample(10, "Sachin");
		System.out.println(s2);
		System.out.println(s2.getXyz());
		s1.setXyz(30);
		System.out.println(s1.getXyz());
		System.out.println(s2.getXyz());
	}
}
