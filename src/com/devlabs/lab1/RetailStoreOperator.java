package com.devlabs.lab1;

public class RetailStoreOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemA=200, itemB=80, itemC=150;
		double Total_Amount;
		boolean member_check= true;
		Total_Amount=((3*itemA)+(5*itemB)+(2*itemC));
		double Discount=0.15*Total_Amount;
		Total_Amount= Total_Amount - Discount;
		Total_Amount=Total_Amount+(0.02*Total_Amount);
		
		System.out.println("Total Amount : "+ Total_Amount);
		
		if ((Total_Amount > 1000) && (member_check==true))
		{
			System.out.println("You earned a gift voucher");
		}
		else
		{	
			System.out.println("Thanks for visiting the store");
		}
	}

}
