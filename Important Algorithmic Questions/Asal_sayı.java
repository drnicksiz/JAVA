package Buldugum_Sorular;
import java.util.Scanner;

public class Asal_sayý {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("sayi giriniz");
				int girilen, i, j;
				girilen = input.nextInt();
				
				for(i = 2; i < girilen; i++) {
					int bolen = 0;
					for(j = 2; j < i ; j++) {
						
						if(i==2) {
							
							System.out.println(i);
							break;
						}
						
						if(i%j == 0) {
							break;
						}
						
						if(i == j+1){
							
							System.out.println(i);
						}
					}
					
					
				}

			}

	}
