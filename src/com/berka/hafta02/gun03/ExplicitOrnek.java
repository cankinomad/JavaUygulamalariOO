package com.berka.hafta02.gun03;

public class ExplicitOrnek {

	public static void main(String[] args) {
		
		byte b;
		int i=257;
		double d = 323.142;
		System.out.println("int>> byte donusumu");
		b= (byte)i;
		System.out.println("i="+ i +"b="+b);
		
		
		System.out.println("double>>int donusumu");
		i=(int)d;
		System.out.println("d="+d+"b="+i);
		
		
		System.out.println("double>>byte donusumu");
		b=(byte)d;
		System.out.println("d="+d+"b="+b);
		
		char char1= (char)-65;
		System.out.println(char1);// ceviremez char eksi bir deger almaz.
		
	}

}
