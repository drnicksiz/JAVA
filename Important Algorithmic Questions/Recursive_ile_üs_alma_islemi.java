package Buldugum_Sorular;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Recursive_ile_�s_alma_islemi {
	
	
	static int �s_al(int taban , int �s) {
		
		if(�s == 0) {
			
			return 1;
		}
		
		return taban * �s_al(taban, �s-1);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ss�n� almak istedi�iniz sayiyi giriniz: ");
		
		int �s = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Taban� giriniz: ");
		int taban = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Sonuc  = "  + �s_al(�s , taban));

	}

}
