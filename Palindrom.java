package Buldugum_Sorular;
import java.sql.SQLOutput;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen kelimeyi giriniz: ");
		
		String kelime = scanner.nextLine();
		int k = 1;
		
		for(int i = 0; i<kelime.length()/2 ; i++) {
			Character c = kelime.charAt(i);
			Character cs = kelime.charAt(kelime.length()-(i+1));
			if(c.equals(cs)) {
				;
			}
			else {
				System.out.println("Kelime palindrom deðildir.");
				k = -1;
				break; 
			}
		}
		
		if(k == 1) {
			System.out.println("Kelime palindromdur.");
		}

	}

}
