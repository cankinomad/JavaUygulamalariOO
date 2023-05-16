package com.berka.hafta02.gun05;

public class StringKonu {

	public static void main(String[] args) {
		String ad = "javax ile";
		// stringin uzunlugunu bulma;
		System.out.println("uzunluk" + ad.length()); // uzunlugunu bulabilirsin.

		// string icinde belrilenen bir indexteki karakteri alma;
		System.out.println("3. index" + ad.charAt(3));
		// for (int i = 0; i < ad.length(); i++) {
		// System.out.println(ad.charAt(i));
		System.out.println("Bastan sona");
		for (int i = ad.length() - 1; i >= 0; i--) {
			System.out.println(ad.charAt(i));
		}
		// bir karakterin kacinci indexte oldugunu bulma
		System.out.println("index =" + ad.indexOf("bir"));
		// 5. indexten sonra kacinci indexte geciyor
		System.out.println("indexten sonra" + ad.indexOf("i", 4));
		System.out.println("indexten sonra" + ad.indexOf("@hotmail.com", 0));

		// subString

		System.out.println("substring " + ad.substring(4));
		System.out.println("substring " + ad.substring(1, 9));
		// baslangic dahil bitis haric,
		String password = "123456";
		String userpasswordInput = " 123456";
		if (password.equals(userpasswordInput.trim())) {// trim ile bosluklari gormuyor aralari temizlemiyor
			System.out.println("Ayni degerler");
		} else {
			System.out.println("Degerler Farkli");
		}
		
		System.out.println("username ornek :");
		String userName="ali";
		
		String userNameInput="Ali";
		
		if(userName.equals(userNameInput.toLowerCase())) {
		
		System.out.println("Degerler ayni");
		}else {
			System.out.println("farkli");
		}
		System.out.println("ali".toUpperCase());
		//valueOf ile string olmayan degerler stringe donusturulebilir.
		int yas=17;
		String a=Integer.toString(yas);
		int b=7;
		String stringSayi="6";
		int c=Integer.parseInt(stringSayi);
		System.out.println(c);
		System.out.println(b+a);
		String yasDegeri=String.valueOf(yas);
		System.out.println(yasDegeri);
		
	}

}
