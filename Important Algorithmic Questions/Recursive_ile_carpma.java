package Buldugum_Sorular;

import javax.swing.JOptionPane;

public class Recursive_ile_carpma {
	
	static int toplama(int sayi1, int sayi2) {
		
		if(sayi2 == 0) {
			return 0;
		}
		
		return sayi1 + toplama(sayi1, sayi2-1);
	}
	public static void main(String[] args) {
		
		String sayi1 = JOptionPane.showInputDialog("1.sayi = ");
		int sayi_1 = Integer.parseInt(sayi1);
		
		String sayi2 = JOptionPane.showInputDialog("2.sayi = ");
		int sayi_2 = Integer.parseInt(sayi2);
		
		JOptionPane.showMessageDialog(null,"Sonuç = " + toplama(sayi_1,sayi_2));
		
	}

}
