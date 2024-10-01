package com.rays.oop.inheritance;

public class Rectangle extends Shape {

	private int lenght;
	private int breath;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public double area() {

		double area = lenght * breath;

		return area;

	}

}
