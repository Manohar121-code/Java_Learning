package com.oops.polymorphism;

public class MethodOverloadingEx {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.m1();
		s1.m1(10);
		s1.m1("java");
		s1.m1(10, "java");
	}
}
