package com.devlabs.lab11;
import java.util.*;  


public class InsertAndRetriveFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		al.add("first");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		
		al.add(2,"New"); 
		System.out.println("The element at 2nd position: "+al.get(2));
		 
	    System.out.print(" "+al);  
	        
	        
	}

}
