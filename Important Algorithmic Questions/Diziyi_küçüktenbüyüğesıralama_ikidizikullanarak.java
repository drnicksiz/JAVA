package Buldugum_Sorular;

public class Diziyi_küçüktenbüyüðesýralama_ikidizikullanarak {

	public static void main(String[] args) {
		
		//int [] sayilar = new int[10]; // 101 elemanlý diziyi oluþturduk.
		//int [] sayilar2 = new int[10];
		int [] sayilar = {3,4,1,7,2};
		int [] sayilar2 = new int[5]; 
		
		
		int indeks = 0;
		
		for(int i = 0; i<sayilar.length ; i++) {
			
			int min = Integer.MAX_VALUE;
			
			for(int j = 0; j<5 ; j++) {
				
				if(sayilar[j] < min) {
					
					min = sayilar[j];
					indeks = j;
				}
			}
			sayilar[indeks] = Integer.MAX_VALUE;
			sayilar2[i] = min;
		}
		
		for(int i : sayilar2) {
			System.out.println(i);
		}

}
}
