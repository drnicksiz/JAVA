package ATM_PROJES�;

import java.util.Scanner;

public class Login {
	
	public boolean login(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kullan�c� ad� = ");
		String kullan�c�_ad� = scanner.nextLine();
		
		System.out.println("Parola");
		
		String parola = scanner.nextLine();
		
		if(hesap.name().equals(kullan�c�_ad�) && hesap.password().equals(parola)) {
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
