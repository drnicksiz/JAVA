package Buldugum_Sorular;

public class Sýralama_dizinin_elemanlarýnýn_yerini_deðiþtirmeden {

	public static void main(String[] args) {
		
		
		
		int [] sayilar = {4,3,6,9,1,2};
		int indeks = 0;
		for(int i = 0; i <sayilar.length ; i++) {
			
			int min = Integer.MAX_VALUE;
			
			for(int j = 0; j<sayilar.length; j++) {
				
				if(sayilar[j] <= min) {
					
					min = sayilar[j];
					indeks = j;
				}
			}
			sayilar[indeks] = Integer.MAX_VALUE;
			System.out.println(min);
		}
		
	}

}
