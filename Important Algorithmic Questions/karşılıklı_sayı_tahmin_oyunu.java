package Buldugum_Sorular;
import java.util.Random;
import java.util.Scanner;

public class kar��l�kl�_say�_tahmin_oyunu {
	
	public static boolean karsilastir(int sayi, int n) {
		
		System.out.println("Kullanici = " +sayi+ "      Bilgisayar = "+ n);
		if(sayi != n) {
			
			System.out.println("Tahmin Yanl�� :)");
			return false;
		}
		System.out.println("Tahmin Do�ru :D ");
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int hak = 5;
		int vic = 0;
		System.out.println("Oyuna ho�geldiniz: ");
		
		
		while(hak != 0) {
			
			Random rand = new Random();
			
			int n = 1 + rand.nextInt(5); // 0 olmamas� i�in 1 ekledim. �u anda 1 ile 5 aras�nda �al���yor ve 5 dahil.
			
			System.out.println("Tahmin : ");
			
			int tahmin = scanner.nextInt();
			
			boolean deger = karsilastir(tahmin, n);
			
			if (deger) {
				
				vic++;
				
				if(vic == 3) {
					
					System.out.println("Tebrikler Kazand�n�z :))))");
					break;
				}
			}
			
			else {
				
				hak--;
				if(hak == 0) {
					System.out.println("Oyun kaybedildi.");
				}
			}
			
		}
	}



}
