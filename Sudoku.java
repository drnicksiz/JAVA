package Sorular;

public class Sudoku {
	
	public static void main(String[] args) {
		
		int[][] dizi = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
				{6, 7, 2, 1, 9, 5, 3, 4, 8},
				{1, 9, 8, 3, 4, 2, 5, 6, 7},
				{8, 5, 9, 7, 6, 1, 4, 2, 3},
				{4, 2, 6, 8, 5, 3, 7, 9, 1},
				{7, 1, 3, 9, 2, 4, 8, 5, 6},
				{9, 6, 1, 5, 3, 7, 2, 8, 4},
				{2, 8, 7, 4, 1, 9, 6, 3, 5},
				{3, 4, 5, 2, 8, 6, 1, 7, 9}
				};
		int say�1 = 0;
		
		for(int i = 0; i<9;i++) {
			int belirte� = 0;
			for(int j = 0; j<9;j++) {
				if(dizi[i][say�1] == dizi[i][j]) {
					belirte�++;
					if(belirte�>1) {
						System.out.println("��z�m yanl��");
						System.exit(0);
					}
				}
			}
			say�1++;
		}
		System.out.println("A");
		int say�2 = 0;
		
		for(int i = 0; i<9;i++) {
			int belirte� = 0;
			for(int j = 0; j<9;j++) {
				
				if(dizi[say�2][i] == dizi[j][i]) {
					
					belirte�++;
					if(belirte�>1) {
						System.out.println("��z�m yanl��");
						System.exit(0);
					}
				}
			}
			say�2++;
		}
		
		System.out.println("��z�m do�rudur.");
		
		
		
	}
}
