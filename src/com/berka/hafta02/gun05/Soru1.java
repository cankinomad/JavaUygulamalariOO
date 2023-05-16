package com.berka.hafta02.gun05;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		//* isaretleri ile diktortgen olusturma;
		Scanner input=new Scanner(System.in);
		int satir,sutun;
		char karakter='*';
		System.out.println("Satir sayisini giriniz:");
		satir=input.nextInt();
		System.out.println("Sutun sayisini giriniz:");
		sutun=input.nextInt();
		
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {//dongu bitince 0'laniyor tekrarlanirsa
				
				System.out.print(karakter);
				
			}System.out.println();
			input.close();
		}
	}

}
