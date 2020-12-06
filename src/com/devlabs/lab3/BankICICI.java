package com.devlabs.lab3;

public class BankICICI implements Bank  {
	
	
	static int a=100;
	static int b=50;

	public void getInterest(int a, int b)
    {
        System.out.println("The interest is :" + (a+b)*3);
    }
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankICICI ab=new BankICICI();
		ab.getInterest(a,b);
	}*/
}

