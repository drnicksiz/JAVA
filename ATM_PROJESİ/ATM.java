package ATM_PROJES�;

import java.util.Scanner;

public class ATM {
	
	public void �al��(Hesap hesap) {
		
		Login giri� = new Login();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sisteme ho�geldiniz :)))");
		
		System.out.println("************************");
		
		System.out.println("Kullan�c� giri�i: ");
		System.out.println("************************");
		
		int giri�_hakk� = 3;
		
		while(true) {
			
			if(giri�.login(hesap)) {
				System.out.println("Giri� ba�ar�l�: ");
				break;
			}
			
			else {
				System.out.println("Giri� ba�ar�s�z.");
				giri�_hakk� -= 1;
				System.out.println("Kalan giri� hakk� = "+ giri�_hakk�);
			}
			
			if(giri�_hakk� == 0) {
				
				System.out.println("Giri� hakk�n�z bitti. Sistemden ��k�lyor.");
				return;// metodu o anda sonland�rmak i�in kullan�labilir. // Komple �al�� metodunu sonlad�r�r.
			}
		}
		
		System.out.println("*********************");
		
		System.out.println("��lemler:  \n1.Bakiye sorgula \n2.Para Yat�rma \n3.Para �ekme \n��k�� i�in q ya bas�n�z.");
		
		while(true) {
			
			System.out.println("��lem se�iniz");
			String i�lem = scanner.next();
			
			if(i�lem.equals("q")){
				System.out.println("Sistemden ��k�l�yor....");
				break;
			}
			
			else if(i�lem.equals("1")) {
				
				System.out.println("�u anki bakiyeniz = " + hesap.money());
			}
			
			else if(i�lem.equals("2")) {
				
				System.out.println("�u anki bakiyeniz = " + hesap.money());
				System.out.println("Ne kadar para yat�rmak istersiniz");
				
				double para = scanner.nextDouble();
				scanner.nextLine();
				
				hesap.para_yat�r(para);
				
				System.out.println("�u anki bakiyeniz = " + hesap.money());
				
				}
			
			else if(i�lem.equals("3")) {
				
				System.out.println("�u anki bakiyeniz = " + hesap.money());
				
				System.out.println("Ne kadar para �ekmek istersiniz =  ");
				double para = scanner.nextDouble();
				scanner.nextLine();
				hesap.para_�ek(para);
				
				System.out.println("�u anki bakiyeniz = " + hesap.money());
				
			}
			
		}
		
	}
}
