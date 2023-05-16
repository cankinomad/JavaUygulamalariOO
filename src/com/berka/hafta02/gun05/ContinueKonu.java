package com.berka.hafta02.gun05;

public class ContinueKonu {

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//				if (i == 5) {// j ile ic donguyu kiriyor
//					continue; // 5'i atliyor.
//				
//				System.out.println(i + " " + j);

	//		}
//		}
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
	}
}
