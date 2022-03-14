package Buldugum_Sorular;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Recursive_ile_üs_alma_islemi {
	
	
	static int üs_al(int taban , int üs) {
		
		if(üs == 0) {
			
			return 1;
		}
		
		return taban * üs_al(taban, üs-1);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üssünü almak istediðiniz sayiyi giriniz: ");
		
		int üs = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Tabaný giriniz: ");
		int taban = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Sonuc  = "  + üs_al(üs , taban));

	}

}
