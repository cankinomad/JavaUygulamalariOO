package com.berka.hafta03.gun1;

import java.util.Iterator;

public class charAt {
//turkce alfabedeki buyuk harflerin ascii karsiligini yaziniiz
	public static void main(String[] args) {
		String alfabe="ABCDEFHiJKLMNOPRSTUVYZ";
		for (int i = 0; i < alfabe.length(); i++) {
			int asciiCode=alfabe.charAt(i);
			System.out.println(alfabe.charAt(i)+"harfi ="+asciiCode);
		}

	}

}
