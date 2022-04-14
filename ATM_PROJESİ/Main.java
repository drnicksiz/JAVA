package ATM_PROJESÝ;

public class Main {

	public static void main(String[] args) {
		
		ATM atm = new ATM(); // ATM class'ýndan bir nesne türettim artýk bu nesne ATM classýnýn tüm özelliklerine sahip.
		
		Hesap hesap = new Hesap("Ýbrahim Aksan","1923",3400);
		
		atm.çalýþ(hesap);
		
		System.out.println("Sistemden çýkýldý. Ýyi günler dileriz.");
		
	}

}
