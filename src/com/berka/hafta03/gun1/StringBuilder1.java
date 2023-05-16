package com.berka.hafta03.gun1;

public class StringBuilder1 { // class adini degistir, kullanacagin metotla ilgili yaziyorsan sonuna sayi ekle

	public static void main(String[] args) {
//		int islemAdet=100000;
//		//islem baslangic zamani:
//		long baslangicZamani=System.currentTimeMillis();
//		String metin="hello";
//		for (int i = 0; i < islemAdet; i++) {
//			metin+=i;
//		}
//		long bitisZamani=System.currentTimeMillis();
//		System.out.println("String ile islem suresi :"+(bitisZamani-baslangicZamani)+"ms");
		
		int islemAdet=100000;
		//islem baslangic zamani:
		long baslangicZamani=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		sb.append("hello");
		for (int i = 0; i < islemAdet; i++) {
			sb.append(i);
		}
		long bitisZamani=System.currentTimeMillis();
		System.out.println("String ile islem suresi :"+(bitisZamani-baslangicZamani)+"ms");
		
		StringBuilder sb1=new StringBuilder();
		
		sb1.append("selam"+ "nasilsin");
		long baslangic=System.currentTimeMillis();
		
		
		long bitis=System.currentTimeMillis();
		
	System.out.println(bitis-baslangic);
		
	String tersi=sb1.reverse().toString();
	
	
	System.out.println(sb1);
	
	System.out.println(sb1.toString());
	
	String kelime="merhaba";
	
	for (int i = kelime.length()-1; i >=0; i--) {
		System.out.print(kelime.charAt(i));
	}
	
	
	
	
	}

}
