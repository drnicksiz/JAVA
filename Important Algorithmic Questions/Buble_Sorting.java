package Buldugum_Sorular;

public class Buble_Sorting {

	public static void main(String[] args) {
		
		int [] sayilar = {3,2,5,1,7,4,3};
		
		int temp;
		int i;
		
		// Buble sorting de dizinin bir �nceki eleman�n� bir sonraki elemanlar kar��la�t�rarak s�ralama y�ntemi kullan�l�yor.
		for(i = 0; i<sayilar.length ; i++) {
			
			for(int j = 0 ; j < sayilar.length-1; j++) {
				
				if(sayilar[j] > sayilar[j+1]) {
					
					temp = sayilar[j];
					sayilar[j] = sayilar[j+1];
					sayilar[j+1] = temp; 
				}
		}
	}
		for(int a : sayilar) {
			System.out.println(a);
			
		}
		
		System.out.println("Dizinin medyan� = " + sayilar.length/2);
		
}
	}
