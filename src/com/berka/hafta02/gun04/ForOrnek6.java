package com.berka.hafta02.gun04;

public class ForOrnek6 {

	public static void main(String[] args) {
		int i;
		for (i = 1; i < 100; i++) {
			if (i % 15 == 0) {// en buyugu genelde yukarida sartla.
				System.out.println("15'in kati" + i);
			} else if (i % 5 == 0) {
				System.out.println("5'in kati" + i);
			} else if (i % 3 == 0) {
				System.out.println("3 'un kati" + i);
			} else {
				System.out.println("3 ve 5 in kati degil " + i);
			}
		}
	}

}
