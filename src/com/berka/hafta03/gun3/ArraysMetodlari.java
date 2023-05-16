package com.berka.hafta03.gun3;

import java.util.Arrays;

public class ArraysMetodlari {

	public static void main(String[] args) {
		
		int[] sayilar= {5,1,3,2,4};
		//diziyi sirali hale getirme.
		String [] iller= {"Ankara","Kars","Izmir","Konya"};
		Arrays.sort(sayilar);//import et
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
		Arrays.sort(iller);
		
		for (int i = 0; i < iller.length; i++) {
			System.out.println(iller[i]);
			
		}
		
		//eleman arama
		
		int index=Arrays.binarySearch(sayilar,88);//aradigin diziyi yaz ve ne aradigini yaz
		if (index>=0) {System.out.println("Eleman bulundu");
		
		}else System.out.println("Eleman bulunamadi");
		System.out.println(index);
		//dizileri karsilastirma
		int[] array1= {0,1,2};
		int[] array2= {1,0,2};
		
		boolean esitMi=Arrays.equals(array1,array2);
		System.out.println(esitMi);//indexleri birebir esit olmali
		
		//diziyi doldurma:
		int[]array3=new int[10];
		Arrays.fill(array3, 1);
		System.out.println(Arrays.toString(array3));
		
		// diziden bir kismi kopyalama
		int []sayilar2= {5,1,3,2,4};
		int[] sayilar2kopya=Arrays.copyOf(sayilar2, 2);//0 dahil 0'dan baslar ve verdigin indise kadar gider
		int[] sayilar2kopya2=Arrays.copyOfRange(sayilar2, 1, 3);//ilkini aliyor sonuncuyu almiyor.
		System.out.println(Arrays.toString(sayilar2kopya));
		
		System.out.println(Arrays.toString(sayilar2kopya2));
		
		int []sayilar4= {5,1,3,2,4};
		int toplam=Arrays.stream(sayilar4).sum();//stream, akisa ceviriyorusun ve farkli islemler yaptirabilirson incele.
		System.out.println(Arrays.stream(sayilar4).average());
		System.out.println(toplam);
	}

}
