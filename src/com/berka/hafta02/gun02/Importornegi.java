package com.berka.hafta02.gun02;


// bazi tanimlari kullanman icin import etmen gerekiuyor
public class Importornegi {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		System.out.println(userInput * 5);
		*/
		/*kullanabilecegimiz bit degerleri byte'dan long'a dogru artiyor
		 * 
		 */
		byte byteSayi=127;
		short shortSayi=32000;
		int intSayi=4545454;
		long longSayi=12345678910L;
		
		//int toplam=byteSayi+shortSayi;
		
		short toplam=(short)(byteSayi+shortSayi); 
		/*short ve byte topladiginda shortun sinirlarini asma ihtimalin oldugundan
		 * otomatik int aliyor. Sinirlari biliyorsan short almasina zorlamak icin
		 * parantez icinde (short) ve islem (byteSayi+shortSayi) olarak yazman lazim.
		 */
		
		/*
		 * hata aliyoruz float ve double kullaninca kucuk de olsa mecburen.
		 */
		float sayi=0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
		System.out.println(sayi);
		
		double sayi1=0.1*0.1;
		System.out.println(sayi1);
		
		//var degiskeniyle atadigini otomatik algiliyor int veya string oldugunu gibi,.,.
		var varDegisken=52;
		char karakter=(char)65;
		System.out.println(varDegisken);
		System.out.println(byteSayi);
		System.out.println(shortSayi);
		System.out.println(intSayi);
		System.out.println(longSayi);
		System.out.println(toplam);
		System.out.println(karakter);
		
	}

} 
