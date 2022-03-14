package Buldugum_Sorular;

public class yirmidoksanasalsorusu {

	public static void main(String[] args) {
		
		System.out.println("20 ile 90 Arasýndaki Asal Sayýlar: ");
		for(int i = 20; i <= 90; i++) {
			
			for(int j = 2 ; j<i ; j++) {
				
				if(i%j == 0) {
					
					break;
				}
				
				else if(i == j+1) {
					System.out.println(i);
				}
			}
		}

	}

}
