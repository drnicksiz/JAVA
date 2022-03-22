package Kart_Eþleþtirme_Oyunu;

import java.util.Scanner;

public class Main {
	
	public static Kart [][] kartlar = new Kart[4][4]; 
	
	public static boolean bittimi(Kart[][] cards) {
		for(int i = 0; i<4; i++) {
    		
    		for(int j = 0; j<4; j++) {
    			
    			if(kartlar[i][j].getTahmin() == false) {				
    				return false;
    			}
    		}
    	}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
        
        while(!bittimi(kartlar)) {
        	System.out.println("\n\nTablo : ");
        	
        	tablo();
        	
        	tahmin_yap();
        }
        System.out.println("Tebrikler oyunu kazandýnýz :D");
	}
	
	public static void tahmin_yap() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nNereyi açmak istersiniz ? ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		
		if(kartlar[s1][s2].getTahmin() == true) {
			
			System.out.println("Bu bölüm zaten açýk.");
			return;
		}
		
		kartlar[s1][s2].setTahmin(true);
		
		tablo();
		
		System.out.println("\n2.olarak nereyi açmak istersiniz ? ");
		int s3 = scanner.nextInt();
		int s4 = scanner.nextInt();
		
		if(kartlar[s3][s4].getTahmin() == true) { 
			
			System.out.println("Bu bölüm zaten açýk.");
			kartlar[s1][s2].setTahmin(false);
			return;
		}
		
		kartlar[s3][s4].setTahmin(true);
		
		tablo();
		

		if(kartlar[s1][s2].getKarakter() != kartlar[s3][s4].getKarakter()) {
			
			System.out.println("\nMaalesef yanlýþ tahmin :(");
			kartlar[s1][s2].setTahmin(false);
			kartlar[s3][s4].setTahmin(false);
			
		}
		
		else {
			System.out.println("\nTebrikler doðru tahmin :D");
		}
		
		}

	
	public static void tablo(){
		
		for(int i = 0; i<4; i++) {
			System.out.println("\n_____________________");
			for(int j = 0; j<4 ; j++) {
				
				if(kartlar[i][j].getTahmin()) {
					
					System.out.print("| " + kartlar[i][j].getKarakter() + " | ");
				}
				else {
				
					System.out.print("|   |");
				}
				}
				
			}
		}
	}


