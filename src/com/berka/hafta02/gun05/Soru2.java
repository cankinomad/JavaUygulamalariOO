package com.berka.hafta02.gun05;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		int satir;
		char karakter='*';
		System.out.println("Satir sayisini giriniz:");
		satir=input.nextInt();
		
		
		for (int i = 0; i < satir; i++) {
			for (int j =0; j<=i; j++) {//dongu bitince 0'laniyor tekrarlanirsa
				
				System.out.print(karakter);
				
			}System.out.println();
			input.close();

	}

}
}
