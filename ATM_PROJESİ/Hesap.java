package ATM_PROJESİ;

public class Hesap {

	private String isim;
	private String parola;
	private double bakiye;
	
	
	public Hesap(String isim,String parola, double bakiye) {
		
		this.isim = isim;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	
	public String name() {
		
		return isim;
	}
	
	public String password() {
		
		return parola;
	}
	
	public double money() {
		
		return bakiye;
	}
	
	public double para_yatır(double para) {
		
		bakiye += para;
		return bakiye;
	}
	
	public void para_çek(double para) {
		
		if(para-bakiye>0) {
			
			System.out.println("Bu miktarda parayı çekemezsiniz");
		}
		
		else {
			this.bakiye -= para;
			System.out.println("Yeni Bakiye = " + this.bakiye);
		}
	}
	
}
