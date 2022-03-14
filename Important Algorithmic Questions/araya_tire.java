package Buldugum_Sorular;
import java.util.Scanner;

public class araya_tire {

	
	public static void blank(String isim) {
		
		for(int i = 0; i<isim.length() ;i++) {
			
			System.out.print(isim.charAt(i));
			
			if(i<isim.length()-1) {
				System.out.print("-");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Arasýna boþluk koyacaðýmýz ismi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		
		String isim = scanner.nextLine();
		
		blank(isim);
	}

}
