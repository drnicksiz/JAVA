package OgrenciListesiwithArrays;

public class Ogrenci {
		
	private String isim;
	private String bolum;
	
	public Ogrenci(String name, String departman) {
		
		this.isim = name;
		this.bolum = departman;
	}
	
	public String getName() {
		return isim;
	}
	
	public String getDept() {
		
		return bolum;
	}
	

}