package com.devlabs.lab7;

import java.util.Scanner;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter the String to trim:"); 
		  String s1 = scan.nextLine();
		  
		 // String s1=" She sells sea shells on the sea shore. ";
		  scan.close();
		  s1=s1.trim();
		  System.out.println("Trimed String is "+s1);
	}

}
