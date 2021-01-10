package com.devlabs.lab7;

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter the First String:"); 
		  String s1 = scan.next(); //array populated from input values through scanner
		  System.out.println("Enter the Second String:"); 
		  String s2 = scan.next();       
		  scan.close();
		  String s3=s1.concat(s2);
		  System.out.println("Concatenate String is "+s3);
	}

}
