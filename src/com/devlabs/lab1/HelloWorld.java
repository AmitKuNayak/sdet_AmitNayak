package com.devlabs.lab1; // Package Declaration 

public class HelloWorld // main class and java file name has to be same always
{
	static int instance_variable=10; // instance variable - inside class outside method
	// should always be declared with static 
	public static void main(String[] args) // starting point of execution 
	// public - everyone can access
	// Static - Don't need object to call this method
	// void - Not Returning any value
	// Java virtual machine always look for this to start the execution of our code
	{
		// TODO Auto-generated method stub
		// int x = 20 ; 							// Local Variable - Inside the method body
		
		System.out.println("Amit Kumar Nayak");
		System.out.println("Welcome to Java Learning Class");
		System.out.println("printing the value for instance_variable:"+instance_variable);
	}

}
