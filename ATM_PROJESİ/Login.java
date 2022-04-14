package ATM_PROJESÝ;

import java.util.Scanner;

public class Login {
	
	public boolean login(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kullanýcý adý = ");
		String kullanýcý_adý = scanner.nextLine();
		
		System.out.println("Parola");
		
		String parola = scanner.nextLine();
		
		if(hesap.name().equals(kullanýcý_adý) && hesap.password().equals(parola)) {
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
