package MineSweeperGame;

public class Blanks {
	
	
	String varMi; // we will assign "yes" or "no" to this valuable. yes = there is a mine / no = no mine 
	boolean visible = false;
	
	public String getVarMi() {
		return varMi;
	}

	public void setVarMi(String varMi) {
		this.varMi = varMi;
	}

	
	
	
	
	void setVisible(boolean vis) {
		this.visible = vis;
	}
	
	boolean getVisible() {
		
		return this.visible;
	}
	
	
}	
