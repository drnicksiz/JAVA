package Buldugum_Sorular;

public class BubleSorting {
	public static void main(String [] args) {
		
		int [] sayilar = {3,2,5,7,4,9,12,8,5,1,1};
		int temp = 0;
		int indeks = 0;
		
		for(int i = 1; i<sayilar.length ; i++) {
			
			for(int j = 0; j < sayilar.length-1; j++) {
				
				if(sayilar[j] > sayilar[j+1]) {
					
					temp = sayilar[j];
					sayilar[j] = sayilar[j+1];
					sayilar[j+1] = temp;
				}
					
			}
		}
		
		for(int i : sayilar) {
			
			System.out.println(i);
		}
}
}
