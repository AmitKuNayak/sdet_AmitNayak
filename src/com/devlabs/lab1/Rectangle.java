package com.devlabs.lab1;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle();
		int area;
		int perimeter ;
		int length=2;
		int width=4;
		//area=length*width;
		//System.out.println("Area of the rectangle : " + area);
		perimeter =2*(length+width);
		System.out.println("Peri of the rectangle : " + perimeter);
		area=r.getArea(length,width);
		System.out.println("Area of the rectangle : " + area);
	}
	
	public int getArea(int a,int b)
	{
		return a*b;
	}
}
