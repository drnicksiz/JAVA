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
		int sayý1 = 0;
		
		for(int i = 0; i<9;i++) {
			int belirteç = 0;
			for(int j = 0; j<9;j++) {
				if(dizi[i][sayý1] == dizi[i][j]) {
					belirteç++;
					if(belirteç>1) {
						System.out.println("Çözüm yanlýþ");
						System.exit(0);
					}
				}
			}
			sayý1++;
		}
		System.out.println("A");
		int sayý2 = 0;
		
		for(int i = 0; i<9;i++) {
			int belirteç = 0;
			for(int j = 0; j<9;j++) {
				
				if(dizi[sayý2][i] == dizi[j][i]) {
					
					belirteç++;
					if(belirteç>1) {
						System.out.println("Çözüm yanlýþ");
						System.exit(0);
					}
				}
			}
			sayý2++;
		}
		
		System.out.println("Çözüm doðrudur.");
		
		
		
	}
}
