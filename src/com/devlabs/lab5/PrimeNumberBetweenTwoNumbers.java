package com.devlabs.lab5;
import java.util.Scanner;

public class PrimeNumberBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int stratNum = reader.nextInt();
        System.out.println("Enter the Second Number : ");
        int endNum = reader.nextInt();
        //int j;
        reader.close();
        boolean flag = false;
        
        for(int num=stratNum;num<=endNum;num++)
        {
        	for (int i=2;i<=num/2;i++)
        	{
        		if(num%i == 0)
	            { 
	                flag = false;
	                break;
	            }
	            else 
	            {
	            	flag=true;
	            }
        	}
        	if (num==2 || num==3){
        		flag=true;
        	}
    		
            if (flag){
        		System.out.println("Prime numer: "+ num);
        	}	
        	
        }
        	
   }
        
        

}
