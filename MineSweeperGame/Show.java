package MineSweeperGame;

public class Show {
	

	void haritaGoster(Blanks [][] harita) {
		
		for(int i  = 0; i<harita.length; i++) {
			System.out.println("--------------------------------------------------");
			for(int j = 0; j<harita.length; j++) {
				
				if(harita[i][j].getVisible() == true && harita[i][j].getVarMi().equals("yes")) { // if there is a mine and also it is visible, prints an M.
					
					System.out.print("| M |");
					continue;
				}
				
				if(harita[i][j].getVisible() == true && harita[i][j].getVarMi().equals("no")) {
					
					System.out.print("|C"+mineCount(harita,i,j)+" |"); // clean = there are no mines here
					continue;
				}
				
				System.out.print("| "+mineCount(harita,i,j)+" |");
				
			}
			System.out.print("\n--------------------------------------------------");
			System.out.println();
			
		}
		
	}
	
	
	int mineCount(Blanks[][] harita,int x,int y) {
		
		int count = 0;
		
		// This loop will examine whether there are mines in the following indices or not.
		
		for(int i = x-1; i<x+2; i++) {
			
			for(int j = y-1; j<y+2 ; j++) {
			
				if((i != -1 && j !=-1) && (i < harita.length && j <  harita.length) && (harita[i][j].varMi.equals("yes"))) {
					count++;
					
					if(i == x  && j == y) {
						count--;
					}
				}
			}
		}
		
		return count; // we actually control the indices that we send to the function but we don't want it to be counted if it has a mine.
		// So we gotta reduce the count by one.
	
	}
	
}
