package Buldugum_Sorular;
import java.io.IOException;
import java.util.Scanner;

public class sorular {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			String letter = scanner.nextLine();
			
			char harf = letter.charAt(0);
			
			int sayi = harf; // b�yle bir atamada harfin ascii kodundaki decimal de�er  sayi de�i�kenine atan�r.
			
			if(harf == 'q') {
				
				break;
			}
			
			else if(sayi >= 97 && sayi <= 122) { // sadece k���k harfleri bast�racak.
				
				System.out.print(harf);
				
			}
			
			else {
				;
			}
		}
	}

}
