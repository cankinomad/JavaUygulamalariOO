package com.berka.hafta03.gun1;

import java.util.Random;

public class randomOrnek {

	public static void main(String[] args) {
		Random rnd=new Random();
		System.out.println(rnd.nextInt(100));
		
		//zar 1-6
		System.out.println(rnd.nextInt(6)+1);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(rnd.nextInt(1, 7));
		}
		
	}

}
