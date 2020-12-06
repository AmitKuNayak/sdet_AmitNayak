package com.devlabs.lab4;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
	      System.out.println("Enter the Number : ");
	      
	      int num = reader.nextInt();
	      
	      reader.close();
	      
	      if(num > 0)
	      {
	          //condition is true
	          System.out.println("Number is positive");
	      }
	      else
	      {
	          //condition is false
	          System.out.println("Number is Negative");
	      }
	  

	}

}
