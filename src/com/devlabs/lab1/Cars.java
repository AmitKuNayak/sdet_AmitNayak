package com.devlabs.lab1;

public class Cars {
	static int tyres=4;
	int Price;
	int Speed; // default value for int is 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c = new Cars();
		c.display("maruti");
		c.Price=10000;
		c.Speed=100;
		Cars.tyres=5;
		System.out.println("value of speed : "+c.Speed);
		System.out.println("value of tyres : "+tyres);
		
		Cars c1 = new Cars();
		c1.display("audi");
		c1.Price=20000;
		c1.Speed=200;
		System.out.println("value of speed : "+c1.Speed);
	}
	public void display(String m) {
		// TODO Auto-generated method stub
		String model = m;
		System.out.println("model : "+model);
		System.out.println("value of tyres before modification : "+tyres);
	}

}
