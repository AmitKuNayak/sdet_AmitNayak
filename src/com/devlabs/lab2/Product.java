package com.devlabs.lab2;

public class Product {
	Product(){
		System.out.println("Product Object Created");
	}
	Product(int pid,int price,String name){
		System.out.println("Product Object2 Created");
		this.pid=pid;
		this.price=price;
		this.name=name;
	}
	/// instance variable
	int pid;
	int price;
	String name;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// behavior 
	public void setProductDeatils(int pid,int price,String name) {
		this.pid=pid;
		this.price=price;
		this.name=name;
		
	}
	public void showProductDetails() {
		System.out.println("product Id: "+pid);
		System.out.println("product Price: "+price);
		System.out.println("product Name: "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor
		Product p=new Product();
		p.setProductDeatils(1, 500, "Noodels");
		p.showProductDetails();
		
		Product p1=new Product(2,1000,"Pasta");
		//p.setProductDeatils(1, 500, "Noodels");
		p1.showProductDetails();
		
	}

}
