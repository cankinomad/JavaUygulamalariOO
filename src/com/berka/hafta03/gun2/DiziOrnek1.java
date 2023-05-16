package com.berka.hafta03.gun2;

import java.util.Scanner;

public class DiziOrnek1 {

	public static void main(String[] args) {
		int[] a = new int[4];
		Scanner input = new Scanner(System.in);
		System.out.println("4 tane sayi giriniz");

		// dizi icine kuillanicidan aldigin elemanlari doldur ve ciktisini al
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			System.out.println(" " + a[i]);

		} // for (int i = 0; i < a.length; i++) { //aldigin ciktiyi gel burada tersten
			// yazdir
//			System.out.println((i+1)+" "+a[a.length-(i+1)]);
//		}
//		for (int i = a.length-1; i >=0; i--) {
//			System.out.println(i+"-"+a[i]);
//		}
		// ters cevirmek
		int temp;
		for (int i = 0; i < a.length / 2; i++) {
			
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;

		}
		for (int i : a) {
			System.out.println(i);
		}
		//templi yapma
		int sayi1=10;
		int sayi2=20;
		System.out.println("Sayi1="+sayi1+" Sayi2="+sayi2);
		int temp2=sayi1;
		sayi1=sayi2;
		sayi2=temp2;
		System.out.println("Sayi1="+sayi1+" Sayi2+"+sayi2);
		
		//tempsiz yapma
		sayi1=sayi1+sayi2;//30
		sayi2=sayi1-sayi2;//10
		sayi1=sayi1-sayi2;//20
				
		String kelime="merhaba";
		StringBuilder kelimeTers=new StringBuilder();
		kelimeTers.append(kelime);
		kelimeTers.reverse();
		System.out.println(kelimeTers.toString());
	}
}
