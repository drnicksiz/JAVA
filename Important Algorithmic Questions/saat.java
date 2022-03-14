package Buldugum_Sorular;

public class saat {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		int j = 0;
		for(i = 0; i<60 ; i++) {
			
			for(j = 0; j<59 ; j++) {
				
				System.out.print(i + " : " + j + "\n");
				Thread.sleep(1000);			
			}
		}
	}
}
