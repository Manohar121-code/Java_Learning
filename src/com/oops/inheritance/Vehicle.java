package com.oops.inheritance;

public class Vehicle {
	private String name;
	private int numOfWheels;
	private int topSpeed;
	private static String type;

	public Vehicle() {
		super();
	}

	public Vehicle(String name, int numOfWheels, int topSpeed, String type) {
		super();
		this.name = name;
		this.numOfWheels = numOfWheels;
		this.topSpeed = topSpeed;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Vehicle.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", numOfWheels=" + numOfWheels + ", topSpeed=" + topSpeed + "]";
	}

}
