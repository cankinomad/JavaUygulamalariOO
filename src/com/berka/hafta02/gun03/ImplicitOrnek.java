package com.berka.hafta02.gun03;

public class ImplicitOrnek {

	public static void main(String[] args) {
		int x =20;
		double y=40.5;
		long p=30;
		float q=10.60f;
		
		//int z=x+y; // cannot convert from double to int
		double z =x+y;
		
		//long r=p-q;// cannot conver from float to long
		float r=p-q;
		
		System.out.println(z);
		
	}

}
