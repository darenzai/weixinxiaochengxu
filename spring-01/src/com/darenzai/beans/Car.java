package com.darenzai.beans;

public class Car {
	
	private String brand;
	
	private String dorp;
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", dorp=" + dorp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

	public Car(String brand, String dorp, double maxSpeed) {
		super();
		this.brand = brand;
		this.dorp = dorp;
		this.maxSpeed = maxSpeed;
		
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private int price;
	
	private double maxSpeed;
}
