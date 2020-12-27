package com.oops.typeCasting;

public class ClassTypeCastingEx {
	public static void main(String[] args) {
		Parent p = new Child();//upcasting
//		p.add();
		doIt(p);
	}

	private static void doIt(Parent p) {
		if (p instanceof Child) {
			Child c = (Child) p; //downcasting
			c.add();
		} else if (p instanceof Child2) {
			Child2 c = (Child2) p; //downcasting
			c.add();
		}
		
		
//		if (p instanceof Child) {
//			Child c = (Child) p;//downcasting
//			System.out.println("cast happened successfully!!!");
//		} else {
//			System.out.println("cast not happened!!!");
//		}
	}
}
