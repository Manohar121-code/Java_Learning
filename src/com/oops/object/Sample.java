package com.oops.object;

public class Sample {
	private int id;
	private String name;
	static int xyz;
	
	static {
		System.out.println("static block called!!!");
	}
	
	{
		System.out.println("non static block called!!!");
	}

	public Sample() {
		super();
		System.out.println("Sample constuctor1 called!!!");
	}

	public Sample(int id, String name) {
		super();
		System.out.println("Sample constuctor2 called!!!");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int getXyz() {
		return xyz;
	}

	public static void setXyz(int xyz) {
		Sample.xyz = xyz;
	}

	@Override
	public String toString() {
		return "Sample [id=" + id + ", name=" + name + "]";
	}

}
