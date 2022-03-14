package Buldugum_Sorular;

public class ErgunReisToplamaSorusu {

	public static void main(String[] args) {
		
		double toplam = 0;
		double m = 0;
		
		for(int i = 1 ; i<=10; i++) {
			
			toplam += Math.pow((double)i/2,(m + 2));
			
			System.out.println("Toplam " + i + " : " + toplam);
		}
		System.out.println("Toplam = " + toplam);
	}

}
