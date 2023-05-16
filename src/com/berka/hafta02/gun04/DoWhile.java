package com.berka.hafta02.gun04;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		int toplam=0;// tanimlamalarini bloklarin {}disina yap. ana blokta olsun.
		do {
			 toplam+=i;
		i++;}
		while (i<101); 
		 			 
		
		System.out.println("toplam :"+toplam);
		
		
	}

}
