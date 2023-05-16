package com.berka.hafta02.gun05;

public class BreakKonu {

	public static void main(String[] args) {
		// Break: Bir donguyu sonlandirmak icin kullanilir. switch,for,while,do while,
		
		for (int i = 0; i <=10; i++) {
			if(i==5) {
		break;
			}
			System.out.println(i);
			
		}
//		int i=1;
//		while(i<=10) {
//			if(i==5)
//			System.out.println(i);
//			i++;
//		}
//		int gun=3;
//		switch (gun) {
//		case 1: System.out.println("pazartesi");
//			
//			break;
//		case 2:
//			System.out.println("Sali");
//			break;
//		case 3:
//			System.out.println("Carsamba");
//			break;
//		default:
//			System.out.println("Geceersiz gun");
//			break;
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				if(i==2) {// j ile ic donguyu kiriyor
//					break;
//				}
//				System.out.println(i+" "+ j);
//			}
//		}
		disDongu:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == 1 && j==1) {
					break disDongu; // dis donguye gitmek icin atama yapip ordan baslatiyorusun.
				}
				System.out.println(i + " " + j);
			}

		}
	}
}
