package com.ryas.polymorphism;

public class Cirlce extends Shape {
	private int radius;

	public Cirlce() {

	}

	public Cirlce(int radius) {

		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		double area = PI * radius * radius;
		return area;
	}
}
