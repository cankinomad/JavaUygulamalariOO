package com.berka.hafta02.gun04;

import java.util.Scanner;

public class WhileOrnek1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum =0;
		int num;
		System.out.println("Bir sayi girin(0'a basarak sonlandirin):");
		
		while ((num=input.nextInt())!=0) { // kullanicidan sayi surekli almak icin yapiyoruz.
			sum+=num;
			System.out.println("Bir sayi girin(0'a basarak sonralndirin):");
			
		}
		System.out.println("Girilen sayilarin toplami :"+ sum);
	}

}
