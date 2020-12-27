package com.oops.inheritance;

public class Ferrari extends Vehicle {
	private int price;
	
	public Ferrari() {
		super();
	}

	public Ferrari(int price) {
		super();
		this.price = price;
	}
	
	public Ferrari(int price, String name, int numOfWheels, int topSpeed, String type) {
		super(name, numOfWheels, topSpeed, type);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ferrari [price=" + price + "]";
	}

}
