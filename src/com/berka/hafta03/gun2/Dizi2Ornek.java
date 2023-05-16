package com.berka.hafta03.gun2;

import java.util.Scanner;

public class Dizi2Ornek {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Dizi eleman sayisini giriniz");
		int elemanSayisi=input.nextInt();
		int [] dizi=new int[elemanSayisi];
		int index = 0;
		int max=dizi[0];//2 for ile coz
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Dizinin "+(i+1)+". elamanini giriniz");
			dizi[i]=input.nextInt();
			 
			if (dizi[i]>max) {
				index=i;
				max=dizi[i];
				
			}//2 forla yap
		}System.out.println("enb sayi="+max+" bulundugu index :"+index);
	}

}
