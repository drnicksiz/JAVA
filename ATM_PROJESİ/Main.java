package ATM_PROJES�;

public class Main {

	public static void main(String[] args) {
		
		ATM atm = new ATM(); // ATM class'�ndan bir nesne t�rettim art�k bu nesne ATM class�n�n t�m �zelliklerine sahip.
		
		Hesap hesap = new Hesap("�brahim Aksan","1923",3400);
		
		atm.�al��(hesap);
		
		System.out.println("Sistemden ��k�ld�. �yi g�nler dileriz.");
		
	}

}
