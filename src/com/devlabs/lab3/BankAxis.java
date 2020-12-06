package com.devlabs.lab3;

public class BankAxis implements Bank {
	static int a=100;
	static int b=50;

	public void getInterest(int a, int b)
    {
        System.out.println("The interest is :" + (a+b)*2);
    }
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAxis ab=new BankAxis();
		ab.getInterest(a,b);
	}*/
}

