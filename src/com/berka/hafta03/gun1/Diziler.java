package com.berka.hafta03.gun1;

public class Diziler {

	public static void main(String[] args) {
		String ogr1="Doruk Tokinan";
		int ogr1not1=65;
		String ogr2="Levent Koyuncu";
		String ogr3="Alperen Sertoglu";
		
		//diizler ayni tip olcak
		//belirli bir boyut verilmesi gerekiyor
		final int OGRENCI_DIZI_ELEMAN_SAYISI=10*2;
		
		String[] ogrenciListe=new String[OGRENCI_DIZI_ELEMAN_SAYISI];
		
		int notlar[]=new int[OGRENCI_DIZI_ELEMAN_SAYISI];
		System.out.println(notlar[1]);
		System.out.println(ogrenciListe[1]);
		System.out.println(notlar.length);
		
		ogrenciListe[0]="Engin Akalin";
		ogrenciListe[1]="Murat CAn Curebal";
		ogrenciListe[2]="Berk Aktas";
		System.out.println("*********************************");
		
		int finalnotlar[]= {20,30,40,50};
		for (int i = 0; i < finalnotlar.length; i++) {
			System.out.println(finalnotlar[i]);
		}
		
	}

}
