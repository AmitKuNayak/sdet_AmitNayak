package com.devlabs.lab7;
import java.text.*;
import java.util.*;
import java.util.Scanner;

public class FindCasesOfLetterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  
		  //System.out.println("Enter the String:"); 
		  //String s1 = scan.nextLine();
			String s1="AbCdefGHijklMNOpqRstUVwxyZ @%*";
		  String uCase="", lCase="", nonChar="";
		 // String s1=" She sells sea shells on the sea shore. ";
		  scan.close();
		  char[] arr = s1.toCharArray();
		  for(char ch1: arr)
	        {
			  //char ch2=new char(ch1);
	           if (Character.isUpperCase(ch1)){
	        	   uCase=uCase+" '"+ch1+"'";
	           }
	           else if(Character.isLowerCase(ch1)){
	        	   lCase=lCase+" '"+ch1+"'";
	           }
	           else {
	        	   nonChar=nonChar+" '"+ch1+"'";
	           }
	        	   
	        }
	      System.out.println(uCase);
	      System.out.println(lCase);
	      System.out.println("Non Char "+nonChar);
	}

}

