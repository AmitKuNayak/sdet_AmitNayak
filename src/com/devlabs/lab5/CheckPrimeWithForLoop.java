package com.devlabs.lab5;
import java.util.Scanner;

public class CheckPrimeWithForLoop {

	public static void main(String[] args) {
	
            // TODO Auto-generated method stub
            
            //import statement for the java.util.package
            //we pass the input stream to the constructor as an argument
            //use the correct next<datatype>() to get the value and store it in a variable of right datatype
            
		Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = scan.nextInt();
        
        scan.close();
        boolean flag = false;
        
        for(int i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            { 
                flag = true;
                System.out.println(flag);
            }
        }
        
        
        if(flag)
          System.out.println(num + " is not a prime no");
        else
            System.out.println(num + " is a prime no");
    }

}