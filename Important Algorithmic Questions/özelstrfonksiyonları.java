package Buldugum_Sorular;
import java.util.Scanner;

public class özelstrfonksiyonlarý {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kelimeyi yazýnýz: ");
		String kelime = input.nextLine();
		
		
		kelime = kelime.trim(); // trim() = Baþtan ve sondan boþluklarý atarak yazýyor.
		
		System.out.println(kelime);
		
		System.out.println("Ýsim ve soyisim: ");
		String isim = input.nextLine();
		
		String soyisim = input.nextLine();
		
		isim = isim.concat(soyisim); // iki stringi birleþtirir (isim baþa soyisim sona)
		
		System.out.println(isim);
		
		String word = input.nextLine();
		
		word = word.indent(3); // satýr baþýndan itibaren içine yazdýðýmýz kadar 
		// boþluk býrakýyor.
		
		System.out.println(word);
		
		String word2 = input.nextLine();
		
		word2 = word2.replace('a', 'u'); // a harflerini u harfi ile deðiþtirecek.
		
		System.out.println(word2);
		
		String word3 = input.nextLine();
		 
		word3 = word3.repeat(4); // stringi yazýlan sayý kadar yan yana yazar.
		
		System.out.println(word3);
		
		System.out.println(word3.length()); // lenght stringin uzunlugunu verir.
		
		System.out.println(word3.charAt(12)); // 12.indeksdeki karakteri bize verir.
	}

}
