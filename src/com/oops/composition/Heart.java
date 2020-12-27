package com.oops.composition;

public class Heart {
	private int roomNums;
	private int size;
	private String quality;

	public Heart() {
		super();
	}

	public Heart(int roomNums, int size, String quality) {
		super();
		this.roomNums = roomNums;
		this.size = size;
		this.quality = quality;
	}

	public int getRoomNums() {
		return roomNums;
	}

	public void setRoomNums(int roomNums) {
		this.roomNums = roomNums;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Heart [roomNums=" + roomNums + ", size=" + size + ", quality=" + quality + "]";
	}

}
