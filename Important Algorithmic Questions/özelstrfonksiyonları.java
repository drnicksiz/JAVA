package Buldugum_Sorular;
import java.util.Scanner;

public class �zelstrfonksiyonlar� {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kelimeyi yaz�n�z: ");
		String kelime = input.nextLine();
		
		
		kelime = kelime.trim(); // trim() = Ba�tan ve sondan bo�luklar� atarak yaz�yor.
		
		System.out.println(kelime);
		
		System.out.println("�sim ve soyisim: ");
		String isim = input.nextLine();
		
		String soyisim = input.nextLine();
		
		isim = isim.concat(soyisim); // iki stringi birle�tirir (isim ba�a soyisim sona)
		
		System.out.println(isim);
		
		String word = input.nextLine();
		
		word = word.indent(3); // sat�r ba��ndan itibaren i�ine yazd���m�z kadar 
		// bo�luk b�rak�yor.
		
		System.out.println(word);
		
		String word2 = input.nextLine();
		
		word2 = word2.replace('a', 'u'); // a harflerini u harfi ile de�i�tirecek.
		
		System.out.println(word2);
		
		String word3 = input.nextLine();
		 
		word3 = word3.repeat(4); // stringi yaz�lan say� kadar yan yana yazar.
		
		System.out.println(word3);
		
		System.out.println(word3.length()); // lenght stringin uzunlugunu verir.
		
		System.out.println(word3.charAt(12)); // 12.indeksdeki karakteri bize verir.
	}

}
