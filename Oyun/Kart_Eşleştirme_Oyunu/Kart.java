package Kart_Eşleştirme_Oyunu;

public class Kart {


	public char karakter;
	public boolean tahmin;
	
	
	public Kart(char c) {
		
		this.karakter = c;
	}
	
	public char getKarakter() {
		
		return karakter;
	}
	
	public boolean getTahmin() {
		
		return tahmin;
	}
	
	public void setTahmin(boolean tahmin) {
		
		this.tahmin = tahmin;
	}
	
	
}
