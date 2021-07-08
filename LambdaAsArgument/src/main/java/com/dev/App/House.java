package com.dev.App;

public class House {
	private double price;
	private int size;
	private int numberOfRooms;
	
	public House(double price, int size, int numberOfRooms) {
		this.price = price;
		this.size = size;
		this.numberOfRooms = numberOfRooms;
	}

	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	@Override
	public String toString() {
		return "Price: " + price +"/n" + "Size: " + size + "/n" + "Number of Rooms: " + numberOfRooms;
	}
}
