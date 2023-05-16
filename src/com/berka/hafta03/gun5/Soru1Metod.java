package com.berka.hafta03.gun5;

import java.util.Arrays;

public class Soru1Metod {

	public static void main(String[] args) {
		int[] dizi= {5,55,10,15,3,20,25};
		System.out.println("Ortalama="+ortalamaHesapla(dizi));
		
		System.out.println(tekMi(6));
		System.out.println(Arrays.toString(sirala(dizi)));
		
		int[] dizi1=sirala(dizi);
		
		for (int i : dizi1) {	//boyle de yazdirabilirisn.
			System.out.println(i);
		
		}
		
		System.out.println(usluSayilar(5, 3));
		
		String  dizi4= "ankara istanbul izmir";
		System.out.println(reverse(dizi4));
		
		System.out.println(asalMi(19));
		
	}
	public static int ortalamaHesapla(int [] sayiDizisi) {//boyle sadece dizi alir sayi gonderemezsin
		int toplam=0;
		int ortalama=0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			toplam+= sayiDizisi[i];
		}
		ortalama=toplam/sayiDizisi.length;
		return ortalama;
	}
	public static int ortalamaHesaplaCoklu(int...sayiDizisi) {//boyle yazarsan hem dizi alir hem de sinirsiz sayi yazabilirsin
		int toplam=0;
		int ortalama=0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			toplam+= sayiDizisi[i];
		}
		ortalama=toplam/sayiDizisi.length;
		return ortalama;
	}
	
	public static boolean tekMi(int x) {
		if(x%2==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int [] sirala(int...sayiDizisi) {
		
		Arrays.sort(sayiDizisi);
		
		return sayiDizisi;
	}
	
	public static int usluSayilar(int taban, int us) {
		return (int)Math.pow(taban, us);
	}//ankara istanbul izmir
	//izmir istanbul ankara
	public static String reverse(String metin) {
		String[] kelimeler=metin.split(" ");
		String yeniMetin="";
		for (int i = 0; i < kelimeler.length; i++) {
			yeniMetin+= kelimeler[kelimeler.length-1-i]+" ";
		}
		
		
		return yeniMetin;
	}
	
	public static boolean asalMi(int sayi) {
		if(sayi<2)
			return false; //eger return calisiyorsa devami calismiyor direk cikiyor 
		
		for (int i = 2; i < sayi; i++) {
			if(sayi%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
