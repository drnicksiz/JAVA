package Buldugum_Sorular;
import java.util.Scanner;

public class Tarih {
	
	public static void tarih(String year, int ay , int day) {
		
		switch(ay) {
		
		case 1:
			System.out.println("G�n: " + day + " Ocak " + year);
			break;
			
		case 2:
			System.out.println("G�n: " + day + " �ubat " + year);
			break;
			
		case 3:
			System.out.println("G�n: " + day + " Mart " + year);
			break;
			
		case 4:
			System.out.println("G�n: " + day + " Nisan " + year);
			break;
			
		case 5:
			System.out.println("G�n: " + day + " May�s " + year);
			break;
			
		case 6:
			System.out.println("G�n: " + day + " Haziran " + year);
			break;
			
		case 7:
			System.out.println("G�n: " + day + " Temmuz " + year);
			break;
			
		case 8:
			System.out.println("G�n: " + day + " A�ustos " + year);
			break;
			
		case 9:
			System.out.println("G�n: " + day + " Eyl�l " + year);
			break;
			
		case 10:
			System.out.println("G�n: " + day + " Ekim " + year);
			break;
			
		case 11:
			System.out.println("G�n: " + day + " Kas�m " + year);
			break;
			
		case 12:
			System.out.println("G�n: " + day + " Aral�k " + year);
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bulundu�unuz y�l� giriniz :");
		int yil = scanner.nextInt();
		scanner.nextLine();
		String year = String.valueOf(yil); // �u an y�l de�eri art�k String bir de�er.
		
		System.out.println("Bulundu�unuz ayi giriniz (Sayi ile): ");
		
		String ay = scanner.nextLine();
		
		int month = Integer.parseInt(ay);
		
		System.out.println("Bulundu�unuz g�n� giriniz : ");
		
		String g�n  = scanner.nextLine();
		
		int day = Integer.parseInt(g�n);
		
		tarih(year,month,day);

	}

}
