package com.berka.hafta02.gun04;

import java.util.Scanner;

public class ForOrnek3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi=input.nextInt();
		
		int i;
		int toplam=0;
		for(i=1;i<=sayi;i++) {
			toplam+=i;
			
		}System.out.println(toplam);

	}

}
