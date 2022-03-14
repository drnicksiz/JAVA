package Buldugum_Sorular;

import java.util.Scanner;

public class Karakter_olarak_girilen_sayýnýn_doublea_dönüstürülmesi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz: ");
		
		String metin = scanner.nextLine();
		
		int basamak = 0;
		
		for(int i = 0;metin.charAt(i) != '.'; i++) {
			
			basamak++;
		}
		
		double toplam = 0;
		
		for(int j = 0; j < basamak; j++) {
			
			toplam += ((int)metin.charAt(j)-48) * Math.pow(10,basamak-j-1);
		}
		
		
		for(int k = basamak+1,a = 1; k <metin.length(); k++,a++) {
			
			toplam += ((int)metin.charAt(k)-48) * Math.pow(10,-a);
		}
		
		System.out.println("Toplam = " + toplam);
	}

}
