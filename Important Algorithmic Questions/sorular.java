package Buldugum_Sorular;
import java.io.IOException;
import java.util.Scanner;

public class sorular {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			String letter = scanner.nextLine();
			
			char harf = letter.charAt(0);
			
			int sayi = harf; // böyle bir atamada harfin ascii kodundaki decimal değer  sayi değişkenine atanır.
			
			if(harf == 'q') {
				
				break;
			}
			
			else if(sayi >= 97 && sayi <= 122) { // sadece küçük harfleri bastıracak.
				
				System.out.print(harf);
				
			}
			
			else {
				;
			}
		}
	}

}
