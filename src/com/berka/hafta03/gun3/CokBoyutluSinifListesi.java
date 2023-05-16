package com.berka.hafta03.gun3;

public class CokBoyutluSinifListesi {

	public static void main(String[] args) {
		String[][] sinifListesi = new String[4][4];
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ece";
		sinifListesi[0][3] = "80";

		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Su";
		sinifListesi[1][3] = "60";

		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Ali";
		sinifListesi[2][3] = "50";

		sinifListesi[3][0] = "4";
		sinifListesi[3][1] = "104";
		sinifListesi[3][2] = "Ertan";
		sinifListesi[3][3] = "30";
		// ok boyutlu dizinin tum elemanlarini listeme
		for (int i = 0; i < sinifListesi.length; i++) {// satir sayisina kadar gider
			for (int j = 0; j < sinifListesi[i].length; j++) {// sutun sayisini bulmam gerek
				System.out.print(sinifListesi[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("==============================");
		// dizide belirli bi satirdaki elemanlari yazdirma;
		// [0][0] [0][1] [0][2] [0][3]
		int yazdirilacakSatir = 0;
		for (int i = 0; i < sinifListesi[yazdirilacakSatir].length; i++) {
			System.out.print(sinifListesi[yazdirilacakSatir][i] + "\t");// tab bosluk birakiyor
		}

		// Dizideki belirli bir sutundaki elemanlari yazdirin
		// [0][0] [1][0] [2][0] [3][0]
		int yazdirilacakSutunIndex = 3;
		System.out.println("=================================");
		for (int i = 0; i < sinifListesi.length; i++) {
			System.out.println(sinifListesi[i][yazdirilacakSutunIndex]);
		}
		// not sutunundaki notlarin toplamini ve ortalamasini ekrana yazdin
		int toplam = 0;
		for (int i = 0; i < sinifListesi.length; i++) {
			toplam = toplam + Integer.parseInt(sinifListesi[i][3]);

		}
		System.out.println(toplam);
		System.out.println("Ortalama :" + (toplam / (sinifListesi.length)));
	}

}
