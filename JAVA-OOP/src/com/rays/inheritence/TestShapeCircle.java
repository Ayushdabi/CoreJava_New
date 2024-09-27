package com.rays.inheritence;

public class TestShapeCircle {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setBorderWidth(5);
		c.setColor("Red");
		c.setRadius(5);
		
		
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		
	}
	
	
	

}
