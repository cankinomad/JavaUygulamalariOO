package com.berka.hafta02.gun02;

import java.util.Scanner;

public class ScannerOrnek {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b, toplam;
		System.out.println("A sayisini giriniz");
		a = input.nextInt();
		System.out.println("B sayisini giriniz");
		b = input.nextInt();
		toplam=a+b;
		System.out.println("A Sayisi :" + a);
		System.out.println("B Sayisi :" + b);
		System.out.println("toplam"+toplam);
		input.close();
	}

}
