package com.berka.hafta03.gun4;

import java.util.Scanner;

public class MetodDeneme2 {
	public static void main(String[] args) {
		baslik("OGRENCI TANIMLA");
		enter();
	}

	public static String baslik(String a) {
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("=*=*" + a + "=*=*=");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=");
		return a;
	}

	public static String enter() {
		Scanner input = new Scanner(System.in);

		return input.nextLine();
	}
}
