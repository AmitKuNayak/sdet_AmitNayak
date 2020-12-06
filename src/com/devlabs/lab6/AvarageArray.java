package com.devlabs.lab6;

import java.util.Scanner;

public class AvarageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[5]; //declaration
        
        //int[] arr = {10,56,34,2,7}; //declaration n initialization together
        
        int sum =0;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        
        for(int i=0;i<5;i++)
        {
            arr[i] = reader.nextInt();
        }
        
        reader.close();
        
        //5 elements - 0 to 4
          for(int i=0;i<arr.length;i++)
          {
              sum = sum + arr[i]; 
            //  sum -= arr[i];
            //  sum += arr[i];  //short-hand notation
          }
         
        
        //JVM finds out the loop counter from the size of the array passed
          
          
        //enhanced for loop - for-each loop
          
          ///type var: collection/array var stores the type of data inside the array
         for(int num : arr)//num=arr[0]
         { 
             sum+=num; //sum = sum+num; }
         }
         
         double avg=(sum/arr.length);
        System.out.println (" "+arr.length);
        System.out.println("Avarage is " +avg);
    }

}
