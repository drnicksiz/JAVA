package Buldugum_Sorular;
import java.util.Scanner;

public class kitap_sorular� {
	// A�A�I AZALAN YILDIZ SORUSU: 
	public static void main(String[] args) {
		
		String y�ld�z = "*";
		
		int basamak;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ka� basamak istersiniz: ");
		
		basamak = scanner.nextInt();
		
		for(int i = basamak; i>0; i--) {
			
			for(int j = 1; j<=i ; j++) {
				
				System.out.print(y�ld�z);
			}
			
			System.out.println(" ");
		}
		
		
	}

}
