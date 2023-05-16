package com.berka.hafta03.gun1;

public class StringDeneme {

	public static void main(String[] args) {
		String ad=new String("Java");
		String ad2=new String("Java");
		
		if(ad==ad2) {
			System.out.println("new ile ayni string== ile kontrol edilince esit");
			
		}else {
			//new ile farkli nesneler olarak olusturuldugu icin bu kisim calisir
			System.out.println("new ile ayni string== ile kontrol edilince esit");
		}if(ad.equals(ad2)) {
			//equals icerik kontrol yaptigi icin ikisiylede esit cikar
			System.out.println("equals ayni string== ile kontrol edilince esit");
			
		}else {
			//new ile farkli nesneler olarak olusturuldugu icin bu kisim calisir
			System.out.println("equals ayni string== ile kontrol edilince esit");
		}
		String soyad="Demirci";
		String soyad2="Demirci";
		if(soyad==soyad2) {
			//havuzdaki ayni nesneyi refere ettikleri icin burasi calisir
			System.out.println("cift tirnak ile ayni string == ile kontrol edilince esit");
		}else {
			System.out.println("cift tirnak ile ayni string == ile kontrol edilince esit degil");
		}if(soyad.equals(soyad2)) {
			//equals icerik kontrol yaptigi icin ikisiylede esit cikar
			System.out.println("equals ile ayni string == ile kontrol edilince esit");
		}else {
			System.out.println("cift tirnak ile ayni string == ile kontrol edilince esit degil");
		}
		
		String mesaj="Merhaba JAva";
		String altStr=mesaj.substring(8,12);
		System.out.println(altStr);
		//escape karakter
		System.out.println("\"\" isareti ile bunu yapabilirsin");
		System.out.println("\t Java1");
		System.out.print("Java2 \n");
		System.out.println("Java3");
	}

}
