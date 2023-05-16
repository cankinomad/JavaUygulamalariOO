package com.berka.hafta03.gun1;

import java.util.Iterator;
import java.util.Random;

public class DiziForEach {

	public static void main(String[] args) {
		int[] not=new int[10];
		Random rnd= new Random();
		for (int i = 0; i < not.length; i++) {
			not[i]=rnd.nextInt(100);
		}
		for (int i : not) {// yazilan i yerine istedigini yazabilirsin
			System.out.println(i);//yukariya ne tanimladiysan buraya da ayni isimde yazman laizm
		}

	}

}
