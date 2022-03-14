package Buldugum_Sorular;

import java.util.Scanner;

public class recursiveilefactorial {
	
	static int faktöriyel(int sayi) {
		
		if(sayi == 1 || sayi == 0) {
			return 1;
		}
		
		return faktöriyel(sayi-1)*sayi;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayiyi giriniZ: ");
		
		int a = scanner.nextInt();
		
		System.out.println("Sonuç = " + faktöriyel(a));
	}

}
