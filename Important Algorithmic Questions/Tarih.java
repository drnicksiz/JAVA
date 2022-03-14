package Buldugum_Sorular;
import java.util.Scanner;

public class Tarih {
	
	public static void tarih(String year, int ay , int day) {
		
		switch(ay) {
		
		case 1:
			System.out.println("Gün: " + day + " Ocak " + year);
			break;
			
		case 2:
			System.out.println("Gün: " + day + " Þubat " + year);
			break;
			
		case 3:
			System.out.println("Gün: " + day + " Mart " + year);
			break;
			
		case 4:
			System.out.println("Gün: " + day + " Nisan " + year);
			break;
			
		case 5:
			System.out.println("Gün: " + day + " Mayýs " + year);
			break;
			
		case 6:
			System.out.println("Gün: " + day + " Haziran " + year);
			break;
			
		case 7:
			System.out.println("Gün: " + day + " Temmuz " + year);
			break;
			
		case 8:
			System.out.println("Gün: " + day + " Aðustos " + year);
			break;
			
		case 9:
			System.out.println("Gün: " + day + " Eylül " + year);
			break;
			
		case 10:
			System.out.println("Gün: " + day + " Ekim " + year);
			break;
			
		case 11:
			System.out.println("Gün: " + day + " Kasým " + year);
			break;
			
		case 12:
			System.out.println("Gün: " + day + " Aralýk " + year);
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bulunduðunuz yýlý giriniz :");
		int yil = scanner.nextInt();
		scanner.nextLine();
		String year = String.valueOf(yil); // þu an yýl deðeri artýk String bir deðer.
		
		System.out.println("Bulunduðunuz ayi giriniz (Sayi ile): ");
		
		String ay = scanner.nextLine();
		
		int month = Integer.parseInt(ay);
		
		System.out.println("Bulunduðunuz günü giriniz : ");
		
		String gün  = scanner.nextLine();
		
		int day = Integer.parseInt(gün);
		
		tarih(year,month,day);

	}

}
