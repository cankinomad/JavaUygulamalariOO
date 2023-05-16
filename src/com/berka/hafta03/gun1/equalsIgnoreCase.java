package com.berka.hafta03.gun1;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String str="ali";
		String str1="Ali";
		
		if(str.equalsIgnoreCase(str1))
		System.out.println("Stringler esittir. Buyuk=kkucuk harf onemsiz");
		else {
			System.out.println("Stringler esit degil");
		}
		String strr=str1.replace('A', 'E');
		System.out.println(strr);
		
		boolean aIleBasladiMi= str1.startsWith("A");
		System.out.println(aIleBasladiMi);
		
		
	}

}
