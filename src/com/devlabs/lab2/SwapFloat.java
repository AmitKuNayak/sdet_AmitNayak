package com.devlabs.lab2;

public class SwapFloat {
	static float a=.10f;
	static float b=.20f;
	float temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapFloat s=new SwapFloat();
		System.out.println(" vlaue before swap a : "+a );
		System.out.println(" vlaue before swap b : "+b );
		s.Swap(a,b);
			
	}
	
	public void Swap(float f1,float f2) {
		temp=f1;
		f1=f2;
		f2=temp;
		//this.a=f1;
		//this.b=f2;
		//System.out.println(" vlaue after swap a : "+a );
		System.out.println(" vlaue after swap a : "+f1 );
		//System.out.println(" vlaue after swap b : "+b );
		System.out.println(" vlaue after swap b : "+f2 );
	}

}
