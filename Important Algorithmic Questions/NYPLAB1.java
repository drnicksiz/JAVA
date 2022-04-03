package SlaytDenemeleri;

public class NYPLAB1 {

	public static void main(String[] args) {
		
		int sayi1 = 1;
		int sayi2 = 1;
		
		for(int i = 0;i<7;i++) {
			
			System.out.println(sayi1);
			System.out.println(sayi2);
			
			sayi1 = sayi1 + sayi2;
			sayi2 = sayi1 + sayi2;
		}
	}

}
