package com.berka.hafta03.gun2;

import java.util.Iterator;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		int [][] koordinatlar= {{3,7},{5,9},{6,10}};
		int[][] noktalar= {{10,20,30},{40,50,60}};
		//{{0.sutun,1.sutun,2/sutun},1.satir,2.satir}
							//satir-sutun
		int[][] dizi1=new int[2][3];
		// 1 2 3
		// 4 5 6
		//dizi1.length=satir uzunlugunu verir hep//her satir icin de sutuna farkli bakman gerekiyor
		
		dizi1[0][0]=1;
		dizi1[0][1]=2;
		dizi1[0][2]=3;
		dizi1[1][0]=4;
		dizi1[1][1]=5;
		dizi1[1][2]=6;
		//satir sayisi
		System.out.println(dizi1.length);
		for (int i = 0; i < dizi1.length; i++) {
			System.out.print(dizi1[i][0]+" "); System.out.print(dizi1[i][1]+" ");System.out.println(dizi1[i][2]);
		}
		//sutun sayisini bulma
		System.out.println(dizi1[1].length);
		
		for (int i = 0; i < noktalar.length; i++) {
			
			for (int j = 0; j < noktalar[i].length; j++) {
				System.out.print(noktalar[i][j]+" ");
				
			}System.out.println();
		}
	}

}
