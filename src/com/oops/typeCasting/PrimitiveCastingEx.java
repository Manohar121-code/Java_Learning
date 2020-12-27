package com.oops.typeCasting;

public class PrimitiveCastingEx {
	public static void main(String[] args) {
		int i = 10;
		long l = i; //widening
		
		int i2 = (int) l; //narrowing
		
		double d = i2; // widening
		System.out.println(d);
		
		
		double d2 = 13.56;
		int i3 = (int) d2;
		System.out.println(i3);
	}
}
