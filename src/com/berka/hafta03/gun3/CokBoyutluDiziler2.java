package com.berka.hafta03.gun3;

public class CokBoyutluDiziler2 {

	public static void main(String[] args) {
		// bu dizideki her satir ve her sutundaki elemanlarin toplamini ayri ayri bulun
		int[][] sayilar = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			for (int j = 0; j < sayilar[i].length; j++) {
				toplam = toplam + sayilar[i][j];
			}
			System.out.println((i + 1) + ".satir toplami :" + toplam);
			toplam = 0;
		}
		// 2. Adim Sutun Toplamlari
		// [0][0] [1][0] [2][0]

		for (int i = 0; i < sayilar[0].length; i++) {// sutun sayisi hepsinin esit diye 0 i aldik

			for (int j = 0; j < sayilar.length; j++) {// satir sayisi
				toplam += sayilar[j][i];// sutunu sabit tutup once satiri donduruyoruz
			}
			System.out.println((i + 1) + ".sutun toplami :" + toplam);
			toplam = 0;
		}

	}

}
