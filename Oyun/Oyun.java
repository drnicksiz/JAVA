package Oyun;
import java.util.Scanner;

public class Oyun {
	
	public static boolean game(String [][] array, String k,int a,int b) {
		String yer_varmi = "yok";
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3;j++) {
				
				if(array[i][j].equals("")) {
					yer_varmi = "var";
					break;
				}
			}
		}
		
		if(yer_varmi.equals("var")) {
			;
		}
		else {
			System.out.println("Oyunda ekleme yapýlacak yer kalmadý. Oyun berabere :))");
			return false;
		}
		
		
		if(array[a][b].equals("")) {
		
			array[a][b] = k;
		}
		else {
			
			System.out.println("Orada zaten bir eleman var. Baþka bir yer seçiniz.");
		}
		
		for(int i = 0; i<3; i++) {
			String kelime = "";
			for(int j = 0; j<3; j++) {
				
				kelime += array[i][j];
			
				if(kelime.equals("xox")) {
					
					System.out.println("Son ekleme yapan oyuncu oyunu kazandý tebrikler :))).");
					return false;
				}
			}
		}
		
		for(int i = 0; i<3; i++) {
			String kelime = "";
			for(int j = 0; j<3; j++) {
				
				kelime += array[j][i];
			
				if(kelime.equals("xox")) {
					
					System.out.println("XOX !!! Son ekleme yapan oyuncu oyunu kazandý tebrikler :))).");
					return false;
				}
			}
		}
		String kelime3 = "";
		String kelime4 = "";
		
		for(int i = 0,j = i,m = 0, n = 2; i<3;j++,i++,m++,n--) {
			
			kelime3 += array[i][j];
			if(kelime3.equals("xox")) {
				System.out.println("!!! Son ekleme yapan oyuncu oyunu kazandý tebrikler :))).");
				return false;
			}
			
			kelime4 += array[m][n];
			if(kelime4.equals("xox")) {
				System.out.println("!!! Son ekleme yapan oyuncu oyunu kazandý tebrikler :))).");
				return false;
			}
		}
		
		return true;
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [][] dizi = new String[3][3];
		
		for(int i = 0; i<3;i++) {
			
			for(int j = 0 ; j<3 ; j++) {
				
				dizi[i][j] = "";
			}
		}
		
		while(true) {
			System.out.println("| " + dizi[0][0] + " | " + dizi[0][1] + " | " + dizi[0][2] + " |");
			System.out.println("----------");
			System.out.println("| " + dizi[1][0] + " | " + dizi[1][1] + " | " + dizi[1][2] + " |");
			System.out.println("-----------");
			System.out.println("| " + dizi[2][0] + " | " + dizi[2][1] + " | " + dizi[2][2] + " |");
			System.out.println("-----------");
			
			
			System.out.println("Nereye oynamak istersiniz?");
			
			try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Hangi karakteri oynamak istersiniz?");
			String k = scanner.nextLine();
			
			
			if(!game(dizi, k, a, b)) {
				
				System.out.println("| " + dizi[0][0] + " | " + dizi[0][1] + " | " + dizi[0][2] + " |");
				System.out.println("----------");
				System.out.println("| " + dizi[1][0] + " | " + dizi[1][1] + " | " + dizi[1][2] + " |");
				System.out.println("-----------");
				System.out.println("| " + dizi[2][0] + " | " + dizi[2][1] + " | " + dizi[2][2] + " |");
				System.out.println("-----------");
				
				System.out.println("Oyun sonlandý.");
				System.exit(0); // O dönerse hata olmadýgýný iþletim sistemine bildirir.
			}

			}catch(Exception e) {				
				System.out.println("Hata ile karþýlaþýldý. Oyunu tekrar baþlatýn.");
				break;
			}
		}	
		
	
	}

}
