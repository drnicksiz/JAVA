package ATM_PROJESÝ;

import java.util.Scanner;

public class ATM {
	
	public void çalýþ(Hesap hesap) {
		
		Login giriþ = new Login();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sisteme hoþgeldiniz :)))");
		
		System.out.println("************************");
		
		System.out.println("Kullanýcý giriþi: ");
		System.out.println("************************");
		
		int giriþ_hakký = 3;
		
		while(true) {
			
			if(giriþ.login(hesap)) {
				System.out.println("Giriþ baþarýlý: ");
				break;
			}
			
			else {
				System.out.println("Giriþ baþarýsýz.");
				giriþ_hakký -= 1;
				System.out.println("Kalan giriþ hakký = "+ giriþ_hakký);
			}
			
			if(giriþ_hakký == 0) {
				
				System.out.println("Giriþ hakkýnýz bitti. Sistemden çýkýlyor.");
				return;// metodu o anda sonlandýrmak için kullanýlabilir. // Komple çalýþ metodunu sonladýrýr.
			}
		}
		
		System.out.println("*********************");
		
		System.out.println("Ýþlemler:  \n1.Bakiye sorgula \n2.Para Yatýrma \n3.Para Çekme \nÇýkýþ için q ya basýnýz.");
		
		while(true) {
			
			System.out.println("Ýþlem seçiniz");
			String iþlem = scanner.next();
			
			if(iþlem.equals("q")){
				System.out.println("Sistemden çýkýlýyor....");
				break;
			}
			
			else if(iþlem.equals("1")) {
				
				System.out.println("Þu anki bakiyeniz = " + hesap.money());
			}
			
			else if(iþlem.equals("2")) {
				
				System.out.println("Þu anki bakiyeniz = " + hesap.money());
				System.out.println("Ne kadar para yatýrmak istersiniz");
				
				double para = scanner.nextDouble();
				scanner.nextLine();
				
				hesap.para_yatýr(para);
				
				System.out.println("Þu anki bakiyeniz = " + hesap.money());
				
				}
			
			else if(iþlem.equals("3")) {
				
				System.out.println("Þu anki bakiyeniz = " + hesap.money());
				
				System.out.println("Ne kadar para çekmek istersiniz =  ");
				double para = scanner.nextDouble();
				scanner.nextLine();
				hesap.para_çek(para);
				
				System.out.println("Þu anki bakiyeniz = " + hesap.money());
				
			}
			
		}
		
	}
}
