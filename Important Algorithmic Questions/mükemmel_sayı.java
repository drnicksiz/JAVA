package Buldugum_Sorular;

public class m�kemmel_say� {
	// 2 den 1000'e kadar olan m�kemmel say�lar: 
	
	public static void m�kemmel(int sayi1, int sayi2) {
		
		for(int i = sayi1; i<= sayi2; i++) {
			
			int toplam = 0;
			
			for(int j = 1; j<i;j++) {
				
				if(i%j == 0) {
					
					toplam += j;
				}
			}
			
			if(toplam == i) {
				
				System.out.println(i + " m�kemmel say�d�r.");
			}
		}
}

	
	public static void main(String[] args) {
		
		m�kemmel(2,1000);
}
}
