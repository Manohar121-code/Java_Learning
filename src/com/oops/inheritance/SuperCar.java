package com.oops.inheritance;

public class SuperCar extends Ferrari {

	private int mileage;

	public SuperCar() {
		super();
	}

	public SuperCar(int mileage) {
		super();
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "SuperCar [mileage=" + mileage + "]";
	}

}
