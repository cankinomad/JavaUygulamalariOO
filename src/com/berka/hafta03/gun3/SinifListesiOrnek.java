package com.berka.hafta03.gun3;

import java.util.Scanner;

import com.berka.hafta03.gun4.MetodDeneme2;

public class SinifListesiOrnek {
	/**
	 * Scaner nesnesi
	 */
	static Scanner input;//scanner'i 1 kere yaz
	public static void menuYazdir() {
		System.out.println("1-Sinif Tanimla");
		System.out.println("2-Ogrencileri tanimla");
		System.out.println("3-Sinif Listele");
		System.out.println("4-Not ver");
		System.out.println("5-notlari listele");
		System.out.println("0-Cikis");

		
	}
	public static void menuyeDon() {
		input=new Scanner(System.in);
		System.out.println("Ana menu icin Enter'a bas.");
		input.nextLine();
	}
	public static int ortalama(int a,int b) {
		return (a+b)/2;
	}
	/**
	 * Kullanicidan int deger almaya yarar
	 * @param mesaj :"kullaniciya gosterilecek mesajdir"
	 * @return : Kullanicinin console'a girdigi degeri doner
	 */
	
	public static int kullanicidanVeriAl(String mesaj) {
		System.out.println(mesaj);
		int veri=input.nextInt();
		input.nextLine();
		return veri;
	}
	
	
	public static void main(String[] args) {

		input = new Scanner(System.in);
		int secim;
		String[] subeListesi;
		int sinifMevcudu = 0;
		String[] sinifListesi = null;
		int[] matNotlari = null;
		do {
			MetodDeneme2.baslik("OKUL OTOMASYONU");
			menuYazdir();
			secim = kullanicidanVeriAl("seciminizi giriniz");
			switch (secim) {
			case 1:

				MetodDeneme2.baslik("SINIF TANIMLA");
				sinifMevcudu = kullanicidanVeriAl("Sinif mevcudunu giriniz");
				sinifListesi = new String[sinifMevcudu];

				break;
			case 2:
				MetodDeneme2.baslik("OGRENCI TANIMLA");

				for (int i = 0; i < sinifListesi.length; i++) {
					System.out.println((i + 1) + ". Ogrenci adini gir.");
					sinifListesi[i] = input.nextLine();
				}
				break;
			case 3:
				MetodDeneme2.baslik("SINIF LISTELE");
				for (String ogrenciAd : sinifListesi) {
					System.out.println(ogrenciAd);
				}
				menuyeDon();

				break;

			case 4:
				MetodDeneme2.baslik("NOT GIRISI");
				matNotlari = new int[sinifMevcudu];
				for (int i = 0; i < matNotlari.length; i++) {
					System.out.println(sinifListesi[i] + " adli ogrencinin 1. notunu giriniz");
					int not1 = input.nextInt();
					if (0 > not1 || 100 < not1) {
						System.err.println("not girisi 0-100 arasi olmali");
						i--;
						continue;
					}
					System.out.println(sinifListesi[i] + " adli ogrencinin 2. notunu giriniz");
					int not2 = input.nextInt();
					if (0 > not2 || 100 < not2) {
						System.err.println("not girisi 0-100 arasi olmali");
						i--;
						continue;
					}
					
					matNotlari[i] = ortalama(not1, not2);
				}

				break;
			case 5:
				MetodDeneme2.baslik("NOTLARI LISTELE");
				notListele(sinifListesi, matNotlari);
				menuyeDon();

				break;
			case 0:
				System.out.println("Programdan cikis yapildi");
				break;
			default:
				System.out.println("Lutfen gecerli bir secim yapiniz");
				break;
			}
		} while (secim != 0);

	}
	/**
	 * @param sinifListesi
	 * @param matNotlari
	 */
	public static void notListele(String[] sinifListesi, int[] matNotlari) {
		System.out.println("Ad \tNot");
		System.out.println("___\t___");
		for (int i = 0; i < matNotlari.length; i++) {
			System.out.println(sinifListesi[i] + "\t" + matNotlari[i]);
		}
	}

}
