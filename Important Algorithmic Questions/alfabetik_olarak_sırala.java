package Buldugum_Sorular;
import java.util.Scanner;

public class alfabetik_olarak_sýrala {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String kelime1 = scanner.nextLine();
		String kelime2 = scanner.nextLine();
		String kelime3 = scanner.nextLine();
		
		String son_kelime = kelime1;
		
		
		
		for(int i = 0; i<2;i++) {
			
			if(son_kelime.compareTo(kelime2)<0) { // compareTo ile iki metni alfabetik olarak karþýlaþtýrabiliyoruz.
				
				son_kelime = kelime2;
				
			}
			
			else if(son_kelime.compareTo(kelime3)<0) {
				
				son_kelime = kelime3;
			}
			
			else if((son_kelime.compareTo(kelime2) == 0) && (son_kelime.compareTo(kelime3) == 0)) {
				
				System.out.println("Tüm kelimeler birbirine eþittir.");
			}
			
			
		}
		
		System.out.println("Son kelime = " + son_kelime);
		

	}

}
