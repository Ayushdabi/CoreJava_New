package com.rays.inheritence;

public class TestShapeTriangle {

	public static void main(String[] args) {
		  Triangle t = new Triangle();
		   t.setColor("Yello");
		   t.setBase(50);
		   t.setBorderWidth(40);
		   t.setHight(8);
		   
		   
		   System.out.println("Base:"+t.getBase());
		   System.out.println("Border:"+t.getBorderWidth());
		   System.out.println("Hight:"+t.getHight());
		   System.out.println("Color:"+t.getColor());
		  
		  
	}
}
