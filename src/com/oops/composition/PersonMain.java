package com.oops.composition;

public class PersonMain {
	public static void main(String[] args) {
		Heart h1 = new Heart(4, 10, "low");
		Person purna = new Person("purna", h1, 6);
		System.out.println(purna);
		
		int height = purna.getHeight();
		System.out.println(height);
		String name = purna.getName();
		System.out.println(name);
		Heart heart = purna.getHeart();
		System.out.println(heart.getQuality());
		System.out.println(heart.getRoomNums());
		System.out.println(heart.getSize());
		
		String quality = purna.getHeart().getQuality();
		System.out.println(quality);
		
	}
}
