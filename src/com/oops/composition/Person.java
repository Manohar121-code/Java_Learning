package com.oops.composition;

public class Person {
	private String name;
	private Heart heart;
	private int height;

	public Person() {
		super();
	}

	public Person(String name, Heart heart, int height) {
		super();
		this.name = name;
		this.heart = heart;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", heart=" + heart + ", height=" + height + "]";
	}

}
