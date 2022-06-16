package MineSweeperGame;

import java.util.Random;

public class Map {
	
	public void haritaOlustur(Blanks [][] harita){ // creates the game map
		
		Random random = new Random();
		
		int mayin = 20; // There are 11 mines in the game. Of course, we can decide on how many mines will be in the game with little touches.
		
		while(!(mayin == 0)) { // creates mines
			
			int rand1 = random.nextInt(10);
			int rand2 = random.nextInt(10);
			
			if(harita[rand1][rand2] == null) {
				
				harita[rand1][rand2] = new Blanks();
				harita[rand1][rand2].varMi = "yes";
				mayin--;
			}
		}
		
		for(int i = 0; i<harita.length;i++) {
			for(int j = 0; j<harita.length;j++) {
				
				if(harita[i][j] == null) {
					harita[i][j] = new Blanks();
					harita[i][j].varMi = "no"; 
				}
			}
		}
	
	}
}
