package com.berka.hafta02.gun03;

public class PrePostIncrementDecrement {

	public static void main(String[] args) {
//		//break point koymak icin soldaki cubuga hangi satiri istiyorsan cift tikla
//		int i=5;
//		int j=++i;	//i ve j simdi 6, once i arttiriyor sonra aktariyor
//		j=i++;		//j halen 6 ama i 7 oldu, once i yi aktarip sonra arttiriyor
//		j=--i;		//i ve j simdi 6;
//		j=i--;		// j simdi de 6 ama i 5 oldu
//		
		boolean aradaMi=true;
//		aradaMi=false;
		
		
		  int i=5; int x=10;
		 
		int sayi=12;
		aradaMi=(sayi>i)&(sayi<x); //sayiyi kullanicidan alcaginda sonradan kontrolunu yapmak icin kullanabilirsin
		
		
		if (aradaMi) {
			System.out.println("Sayi belirlenen aralikta ");
		}else {
			System.out.println("Sayi belirlenen aralikta degil ");
			
		}
				
	}
	
}
