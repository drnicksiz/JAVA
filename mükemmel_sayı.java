package Buldugum_Sorular;

public class mükemmel_sayý {
	// 2 den 1000'e kadar olan mükemmel sayýlar: 
	
	public static void mükemmel(int sayi1, int sayi2) {
		
		for(int i = sayi1; i<= sayi2; i++) {
			
			int toplam = 0;
			
			for(int j = 1; j<i;j++) {
				
				if(i%j == 0) {
					
					toplam += j;
				}
			}
			
			if(toplam == i) {
				
				System.out.println(i + " mükemmel sayýdýr.");
			}
		}
}

	
	public static void main(String[] args) {
		
		mükemmel(2,1000);
}
}
