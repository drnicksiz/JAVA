package Buldugum_Sorular;

import java.util.Scanner;

public class recursiveilefactorial {
	
	static int fakt�riyel(int sayi) {
		
		if(sayi == 1 || sayi == 0) {
			return 1;
		}
		
		return fakt�riyel(sayi-1)*sayi;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayiyi giriniZ: ");
		
		int a = scanner.nextInt();
		
		System.out.println("Sonu� = " + fakt�riyel(a));
	}

}
