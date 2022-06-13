package Biyoloji;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		DNA dna = new DNA(); 
				
		char[] DNA = dna.dnaOlustur();
		
		
		// Sekanslarý ve Complementleri oluþturma kýsmý: 
		
		System.out.println("Kaç sekans istiyorsunuz : "); 
		int N = scanner.nextInt();
		
		System.out.println("Sekans uzunluðunu giriniz: ");
		int L = scanner.nextInt(); scanner.nextLine();
		
		Sequence sekans = new Sequence(DNA,N,L); char[][] sekanslar = sekans.sequences(); // Sekanslarý oluþturma.
		
		char[][]complements = complement(sekanslar,N,L); // Complementleri oluþturma.
		
		
		
		
 		// Indel, eþleþmeme, eþleþme puanlarýnýn hepsi pozitif girilecek.
		System.out.println("Eþleþme skorlarýný bulma adýmýna ulaþýldý. Lütfen indel match ve dismatch ' ler için atamak istediðiniz puanlarý veriniz: "
				+ "\nAtanacak tüm puanlar pozitif olarak girilecektir.");
		
		System.out.println("Indel puanýný giriniz: ");
		int indel = scanner.nextInt(); scanner.nextLine();
		
		System.out.println("Eþleþmeme durumu için puanýný giriniz: ");
		int mismatch = scanner.nextInt(); scanner.nextLine();
		
		System.out.println("Eþleþme durumu için puaný giriniz: ");
		int match = scanner.nextInt(); scanner.nextLine();
		
		
		// Eþleþme skoru bulma
        int[][] SkorMatrisi = new int[N][N]; // Her bir sekansýn karþýlaþtýrýlýp skorlarýnýn kaydedildiði dizi.
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
            	
                if (i == j) {
                	
                    SkorMatrisi[i][j] = 0;
                    
                } else if(i<j) {
                    SkorMatrisi[i][j] = bestoverLap(L, indel, match, mismatch, sekanslar[i], sekanslar[j]);
                }
                else {
                    SkorMatrisi[i][j] = bestoverLap(L, indel, match, mismatch, sekanslar[i], complements[j]);
                }
            }
        }
        
        System.out.println("Skor matrisi oluþturuluyor. Skor matrisinde kabul edilen en küçük deðeri giriniz: ");
        int T = scanner.nextInt();scanner.nextLine();
        
        PrintWriter dosya = null; // Yazdýrma iþlemini PrintWriter ile yaptým.
        
		try {
			dosya = new PrintWriter("C:\\Users\\ibrahim\\Desktop\\odev.txt");
			dosya.print("   ");
			for(int i =0;i<N;i++) {
				dosya.printf("  %2d",i+1);
			}
			dosya.printf("\n   -");
			for(int i =0;i<N;i++) {
				dosya.printf("----");
			}
			dosya.printf("\n");
			for(int i =0;i<N;i++) {
				
				dosya.printf("%-2d|",i+1);
				
				for(int j=0;j<N;j++) {
					if(SkorMatrisi[i][j]>T) {
						dosya.printf("  %2d",SkorMatrisi[i][j]);
					}
					else if(i == j) {
						dosya.printf("   * ");
					}
					else {
						dosya.printf("    "); // T den küçük deðerlerde matrisin o indisi boþ olacak.
					}
					}
				dosya.printf("\n\n");
			}
			
			System.out.println("Skor matrisi yazdýrýldý.");
			
		} catch (FileNotFoundException ex) {
			
			System.out.println("Dosya bulunamadý.");
			
		} finally {
			
			dosya.close(); // Ýþlemin sonunda dosya kapatmak için yazdýðým kod.
			
		}
		
		
		
		
		/* System.out.println("Konselsus olmasý için minimum kaç bazýn örtüþmesi gerktiðini giriniz : ");
		
		int min = scanner.nextInt();
		
		int m = 0;
		
		for(int i = 0; i<N;i++) {
			
			for(int j = 0; j<N;j++) {
				
				if(SkorMatrisi[i][j]>=min) {
					 // minden byük skorlarý bulup karþýlaþtýrma yapýlacak. 8.3 teki örnek için.
				}
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	static char[][] complement(char[][] sekanslar,int N,int L){
		
		
		char [][] complements = new char[N][L]; // Complementleri atamak için kullandýðým dizi
		
		for(int i = 0; i<N; i++) {
			
			int temp = 0;
			
			for(int j = L-1; j>=0; j--) { 
				
				if(sekanslar[i][j] == 'A') {
					
					complements[i][temp++] = 'T';
				}
				
				else if(sekanslar[i][j] == 'T') {
					
					complements[i][temp++] = 'A';
				}
				
				else if(sekanslar[i][j] == 'C') {
					
					complements[i][temp++] = 'G';
				}
				
				else if(sekanslar[i][j] == 'G') {
					
					complements[i][temp++] = 'C';
				}
			}
		}
		
		System.out.println("COMPLEMENTLER: \n");
		
		for(int i = 0; i<N;i++) {
			
			for(int j = 0; j<L;j++) {
				
				System.out.print(complements[i][j]);
			}
			System.out.println();
		}
		return complements;
	}
	
	

	static int bestoverLap(int L, int indel, int match, int mismatch, char[] sekanslar, char[] complementler) {

    int[][] matris = new int[L + 1][L + 1]; 

    for (int i = 1; i < L + 1; i++) {
        for (int j = 1; j < L + 1; j++) {
        	
            int matchmismatch; // match ya da mismatch için puan atayacaðým deðiþken.
            
            if (sekanslar[i - 1] == complementler[j - 1]) { // Eþleþme durumu 
            	
                matchmismatch = match;
            } else {
                matchmismatch = - mismatch;
            }

            matris[i][j] = Math.max(Math.max(matris[i - 1][j] - indel, matris[i][j - 1] - indel), matris[i - 1][j - 1] + matchmismatch);

        }
    }

    int bestOverlap = matris[1][L]; // En iyi skorumuz baþlangýç olarak bu olsun. Ayný satýr ve sütunlardaki en büyük skoru bulmaya çalýþacaðýz. En iyi
    // overlap skorumuz o olmuþ olacak.
    
    for (int k = 2,t =1; k < L + 1; k++,t++) {
        if (matris[k][L] > bestOverlap) {
            bestOverlap = matris[k][L];
        }
        
        if(matris[L][t] > bestOverlap) {
        	bestOverlap = matris[L][t];
        }
    }
    
    return bestOverlap;

}
}