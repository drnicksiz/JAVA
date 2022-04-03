package Buldugum_Sorular;

public class FibonacciRecursive {
	
	public static int fibonacci(int n) {
		
		if(n == 1 || n == 0) {
			return 1;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i<8;i++) {	
			System.out.println(fibonacci(i));
		}
	}
}
