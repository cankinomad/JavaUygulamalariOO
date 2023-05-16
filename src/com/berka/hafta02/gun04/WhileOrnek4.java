package com.berka.hafta02.gun04;

import java.util.Scanner;

public class WhileOrnek4 {
	//length(): uzunlugu verir
	//charAt(index): verilen indexteki karakteri alir.
	//.equals: esitlik kontrolu icin kullanilir.
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime=input.next();
		String kelimeTers="";
		
		int i=kelime.length()-1;//kelime uzunlugu 6 olabilir ama indis uzunlugu onun 1 eksigi oldugu icin -1 yapiyoruz
				
		while(i>=0) {
			kelimeTers+=kelime.charAt(i);
			i--;
		}
		System.out.println(kelimeTers);
		
		if (kelimeTers.equals(kelime)) {
			System.out.println("Tersi ayni");
		}else {
			System.out.println("Tersi Farkli");
		}
	}

}
