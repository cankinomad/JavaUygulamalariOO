package com.berka.hafta03.gun1;

import java.util.Random;

public class DiziOrnek1 {

	public static void main(String[] args) {
		int[]sayilar=new int[10];
		Random rnd=new Random();
		double toplam=0;
		double ortalama;
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i]=rnd.nextInt(0,101);
			toplam+=sayilar[i];
		}ortalama=toplam/sayilar.length;
		System.out.println("toplam :"+toplam+" ortalama"+ortalama);
		toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}System.out.println(toplam);
	}

}
