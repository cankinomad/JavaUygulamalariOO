package com.berka.hafta03.gun1;

import java.util.Random;

public class DiziOrnek {

	public static void main(String[] args) {
		//20 tane int degerden olusan notlar dizisi olursuturn
		//icerisine 0=100 arasi rastgele notlar doldurun
		
		int[] sayilar=new int[20];//eleman sayisi belirtiyoruz
		Random rnd=new Random();
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i]=rnd.nextInt(101);
	
		}
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(i+" "+sayilar[i]);
		}
			
		System.out.println(sayilar[19]);//erismeye calisian indis numarasi
		
		
	}

}
