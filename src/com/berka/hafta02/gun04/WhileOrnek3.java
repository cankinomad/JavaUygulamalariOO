package com.berka.hafta02.gun04;

import java.util.Scanner;

public class WhileOrnek3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Harf sayisini bulmak istedgiiniz kelimeyi giriniz");
		String kelime=input.next();//tek kelime almak icin kullanilir(bosluga kadar olan kisim)
		// nextline enter a basilana kadar tum ifadeyi alir
		
		int uzunluk=0;
		while (uzunluk<kelime.length()) // .length uzunlugunu veriyor.
			uzunluk++;
			
			
		System.out.println("Kelimenin harf sayisi"+ uzunluk);
	}

}
