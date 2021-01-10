package com.devlabs.lab7;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter the main String:"); 
		  String s1 = scan.nextLine();
		  System.out.println("Enter the String to replace:"); 
		  String s2 = scan.nextLine();
		  System.out.println("Enter the String to replace with:"); 
		  String s3 = scan.nextLine();
		 // String s1=" She sells sea shells on the sea shore. ";
		  scan.close();
		  s1=s1.replace(s2,s3);
		  System.out.println("Replced String is "+s1);
	}

}
