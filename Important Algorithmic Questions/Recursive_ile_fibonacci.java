package Buldugum_Sorular;

import java.util.Scanner;

public class Recursive_ile_fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n == 0) {
			
			return 0;
		}
		
		if(n == 1 || n == 2) {
			
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa hoþgeldiniz. ");
		
		int sayi = scanner.nextInt();
		
		for(int i = 0 ; i<sayi; i++) {
			
			System.out.print(" " + fibonacci(i));
		}
}
}
