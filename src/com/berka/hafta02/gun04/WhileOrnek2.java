package com.berka.hafta02.gun04;

import java.util.Scanner;

public class WhileOrnek2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi=input.nextInt()	;
		int temp=sayi;
		int fakt=1;
		while (sayi>0) {
			fakt=fakt*sayi;
			
			sayi--;
		}System.out.println(temp+"!="+fakt);
	}

}
