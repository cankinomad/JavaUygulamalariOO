package com.berka.hafta02.gun04;

public class Tekrarcalismasi {

	public static void main(String[] args) {
		int sayi1=3;
		int sayi2=2;
		int andSonucu=sayi1&sayi2;
		int orSonucu=sayi1|sayi2;
		
		System.out.println(andSonucu);
		System.out.println("Or sonucu :"+ orSonucu);
		
		sayi1=5;
		sayi2=10;
								// 5			9		9 		5	
				System.out.println(sayi1++ + --sayi2 + sayi2-- + --sayi1);
				
				//sayi1++ = islemden sonradan arttir.
				//--sayi2 = islemden once eksilt.

	}

}
