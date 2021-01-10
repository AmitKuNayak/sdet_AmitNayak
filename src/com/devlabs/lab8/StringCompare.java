package com.devlabs.lab8;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String to compare:"); 
		  String s1 = scan.next(); //array populated from input values through scanner
		  System.out.println("Enter the Second String compare:"); 
		  String s2 = scan.next();       
		  scan.close();
		  if (s1.compareTo(s2)==0){
			  System.out.println("string 1 is equal to string 2 by compareTo"); 
	        } 
	        else
	        {
	         System.out.println("string 1 is not equal to string 2 by compareTo");
	         }  
		  if (s1.compareToIgnoreCase(s2)==0){
			  System.out.println("string 1 is equal to string 2 by compareToIgnoreCase"); 
	        } 
	        else
	        {
	         System.out.println("string 1 is not equal to string 2 by compareToIgnoreCase");
	         }  
	}

}
