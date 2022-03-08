package OgrenciListesiwithArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void ogrenci_listesi(ArrayList<Ogrenci> liste) {
		
		for(int j = 0; j<liste.size();j++) {
			
			System.out.println("Ogrenci ismi : " + liste.get(j).getName() + " Bölümü : " + liste.get(j).getDept());
		}
	}
	public static void islemleri_goster() {
		
		System.out.println("Ýþlem 0 : Ýþlem Menüsü");
		System.out.println("Ýþlem 1 : Ogrenci Ekle");
		System.out.println("Ýþlem 2 : Ogrenci Sil");
		System.out.println("Ýþlem 3 : Ogrenci Listesini Görüntüle");
		System.out.println("Ýþlem 4 : Uygulamayý kapat");
	}
	
	public static void main(String[] args) {
		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisteme hoþgeldiniz :)) ");
		islemleri_goster();	
	
		
		while(true) {
			
			
			System.out.println("Ýþlem : ");
			int islem = scanner.nextInt();
			scanner.nextLine();
			
			if (islem == 0) {
				
				islemleri_goster();
			}
			
			else if(islem == 1) {
				
				System.out.println("Eklemek istediðiniz öðrencinin ismi : ");
				String isim = scanner.nextLine();
				System.out.println("Bölümü : ");
				String bolum = scanner.nextLine();
				
				Ogrenci ogrenci = new Ogrenci(isim, bolum);
				
				ogrenciler.add(ogrenci);
			}
			
			else if (islem == 2) {
					
					if(ogrenciler.size() != 0) {
						
					System.out.println("Silmek istediðiniz öðrencinin ismini giriniz: ");
					
					String name = scanner.nextLine();
					
					for(int i = 0; i<ogrenciler.size();i++) {
						
						if(ogrenciler.get(i).getName().equals(name)) {
							
							ogrenciler.remove(i);
							break;
						}
					}	
			}
					System.out.println("Liste þu anda boþ");
					}
			
			
			else if(islem == 3) {
				if(ogrenciler.size() != 0) {
					
					ogrenci_listesi(ogrenciler);
				}
			}
			
			else if(islem == 4) {
				System.out.println("Uygulamadan çýkýldý");
				break;
			}
		}
	}
}
