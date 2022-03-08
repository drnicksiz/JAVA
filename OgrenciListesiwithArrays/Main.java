package OgrenciListesiwithArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void ogrenci_listesi(ArrayList<Ogrenci> liste) {
		
		for(int j = 0; j<liste.size();j++) {
			
			System.out.println("Ogrenci ismi : " + liste.get(j).getName() + " B�l�m� : " + liste.get(j).getDept());
		}
	}
	public static void islemleri_goster() {
		
		System.out.println("��lem 0 : ��lem Men�s�");
		System.out.println("��lem 1 : Ogrenci Ekle");
		System.out.println("��lem 2 : Ogrenci Sil");
		System.out.println("��lem 3 : Ogrenci Listesini G�r�nt�le");
		System.out.println("��lem 4 : Uygulamay� kapat");
	}
	
	public static void main(String[] args) {
		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisteme ho�geldiniz :)) ");
		islemleri_goster();	
	
		
		while(true) {
			
			
			System.out.println("��lem : ");
			int islem = scanner.nextInt();
			scanner.nextLine();
			
			if (islem == 0) {
				
				islemleri_goster();
			}
			
			else if(islem == 1) {
				
				System.out.println("Eklemek istedi�iniz ��rencinin ismi : ");
				String isim = scanner.nextLine();
				System.out.println("B�l�m� : ");
				String bolum = scanner.nextLine();
				
				Ogrenci ogrenci = new Ogrenci(isim, bolum);
				
				ogrenciler.add(ogrenci);
			}
			
			else if (islem == 2) {
					
					if(ogrenciler.size() != 0) {
						
					System.out.println("Silmek istedi�iniz ��rencinin ismini giriniz: ");
					
					String name = scanner.nextLine();
					
					for(int i = 0; i<ogrenciler.size();i++) {
						
						if(ogrenciler.get(i).getName().equals(name)) {
							
							ogrenciler.remove(i);
							break;
						}
					}	
			}
					System.out.println("Liste �u anda bo�");
					}
			
			
			else if(islem == 3) {
				if(ogrenciler.size() != 0) {
					
					ogrenci_listesi(ogrenciler);
				}
			}
			
			else if(islem == 4) {
				System.out.println("Uygulamadan ��k�ld�");
				break;
			}
		}
	}
}
