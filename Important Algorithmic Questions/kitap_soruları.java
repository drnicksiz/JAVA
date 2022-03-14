package Buldugum_Sorular;
import java.util.Scanner;

public class kitap_sorularý {
	// AÞAÐI AZALAN YILDIZ SORUSU: 
	public static void main(String[] args) {
		
		String yýldýz = "*";
		
		int basamak;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç basamak istersiniz: ");
		
		basamak = scanner.nextInt();
		
		for(int i = basamak; i>0; i--) {
			
			for(int j = 1; j<=i ; j++) {
				
				System.out.print(yýldýz);
			}
			
			System.out.println(" ");
		}
		
		
	}

}
