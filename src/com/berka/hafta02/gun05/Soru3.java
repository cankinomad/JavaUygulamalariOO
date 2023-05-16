package com.berka.hafta02.gun05;

import java.util.Scanner;

public class Soru3 {
	// carpim tablosunda girilen sayinin tablosunu olustur
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=input.nextInt();
		int carpim;
		for (int i = 1; i <= 10; i++) {
			
			carpim = sayi*i;
			System.out.println(sayi+"x"+i+" ="+carpim);
		}
		input.close();
	}

}
