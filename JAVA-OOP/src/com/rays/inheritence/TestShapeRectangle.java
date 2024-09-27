package com.rays.inheritence;

import java.awt.geom.Area;

public class TestShapeRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setBorderWidth(50);
		r.setHeight(5);
		r.setWidth(5);
		r.setColor("red");

		System.out.println("Width:-" + r.getWidth());
		System.out.println("Border:" + r.getBorderWidth());
		System.out.println("Hight:" + r.getHeight());
		System.out.println("Color:" + r.getColor());
	}

}
