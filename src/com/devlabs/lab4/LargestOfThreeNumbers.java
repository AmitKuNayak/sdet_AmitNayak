package com.devlabs.lab4;
import java.util.Scanner;

public class LargestOfThreeNumbers {
	/*static int a;
	static b;
	static c;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
	      System.out.println("Enter the the First Number : ");
	      int num1 = reader.nextInt();
	      
	      System.out.println("Enter the the First Number : ");
	      int num2 = reader.nextInt();
	      
	      System.out.println("Enter the the First Number : ");
	      int num3 = reader.nextInt();
	      
	      reader.close();
	      
	      if ((num1>num2) && (num1>num3)) {
	    	  System.out.println("The largest numbe is: "+num1);
	      }
	    	  
	      else if((num2>num1) && (num2>num3)) {
	    	  System.out.println("The largest numbe is: "+num2);
	      }
	      else if((num3>num1) && (num3>num2)) {
	    	  System.out.println("The largest numbe is: "+num3);
	      }  
	      else {
	    	  System.out.println("There is no single largest number among number "+num1+","+num2+","+num3);
	      }
	      
	}

}
