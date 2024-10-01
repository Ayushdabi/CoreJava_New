package com.ryas.polymorphism;

public class TestShapeConstrution {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];

		s[0] = new Cirlce(1);
		s[1] = new Triangle(5, 5);
		s[2] = new Rectangle(10, 10);

		for (Shape a : s) {

			System.out.println(a.area());

		}
	}
}
