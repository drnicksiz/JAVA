package Buldugum_Sorular;

import java.util.Scanner;

public class Harf_Frekansý_Bulma {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Metni giriniz: ");
		
		String metin = scanner.nextLine();
		
		for(int i = 0; i< metin.length(); i++) {
			int sayi = 0;
			int belirtec = 1;
			Character c = metin.charAt(i);
			
			for(int m = i-1; m>=0 ; m--) {
				
				if(c.equals(metin.charAt(m))) {
					belirtec = -1;
				
				}
			}
			
			if(belirtec == -1) {
				
				continue;
			}
			
			
			for(int j = 0; j<metin.length(); j++) {
				
				if(c.equals(metin.charAt(j))) {
					
					sayi++;
				}
			}
			System.out.println(c + " harfinden " + sayi+ " tane vardýr.");
		}
	}

}
