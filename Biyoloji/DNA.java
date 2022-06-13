package Biyoloji;

import java.util.Scanner;

public class DNA {
	
	Scanner scanner = new Scanner(System.in);
		
	int dnaLength;
	
	char[] dnaOlustur() {
		
		System.out.println("DNA uzunluðunu giriniz: ");
		dnaLength = scanner.nextInt();
	
		char[] DNA = new char[dnaLength];
	
		System.out.println("DNA rastgele mi oluþsun ?  (Evetse 1; hayýrsa0 tuþuna basýnýz)");
		int in = scanner.nextInt();
		scanner.nextLine();
	
		if( !((in == 1) || (in == 0))){
		
			System.out.println("Hatalý bir tuþlama yaptýnýz. Programý yeniden baþlatýnýz.");
			System.exit(0);
		}
	
		else if(in == 1) {
			int sayý;
			for(int i = 0; i< dnaLength;i++) {
			
				sayý = (int) (Math.random()*4);
				if(sayý == 0) {
				DNA[i] = 'A';
				}
				else if(sayý == 1) {
				DNA[i] = 'T';
				}
			
				else if(sayý == 2) {
					DNA[i] = 'C';
				}
			
				else {
					DNA[i] = 'G';
			}
		}
	}
	
		else if(in == 0) {
		
			System.out.println("DNA'yý giriniz: ");
		
			String dna = scanner.nextLine();
		
			for(int i = 0; i<dna.length(); i++) {
			
				DNA[i] = dna.charAt(i);
			}
		}
			System.out.print("DNA: --> ");
			for(int i = 0; i<DNA.length;i++) {
			
				System.out.print(DNA[i]);
			}
			System.out.println();
		
			return DNA;
	}
}
