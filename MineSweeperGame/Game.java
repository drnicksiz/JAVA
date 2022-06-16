package MineSweeperGame;

import java.util.Scanner;

public class Game {
	
	Blanks[][] blanks;
	Show g;
	
	static Scanner scanner = new Scanner(System.in);
	
	public Game(Blanks [][] blanks, Show g) {
		
		this.blanks = blanks;
		this.g = g;
	}
	
	void startGame() {
		
		System.out.println("Welcome to the game 😁 (10 x 10 map -- 20 mines). Now you gotta find where the safe places are 😈😈");
		

		while(true) {
			
			g.haritaGoster(blanks);
			
			
			try {
			System.out.println("x : ");
			int x = scanner.nextInt();scanner.nextLine();
			
			
			System.out.println("y : ");
			int y = scanner.nextInt();
			
			
			
			
			if(blanks[x][y].visible) {
				System.out.println("Already opened !");
				continue;
			}
			
			
			if(blanks[x][y].getVarMi() == "yes") {
				System.out.println("Oh no!! You stepped on a mine 😵");
				
				blanks[x][y].setVisible(true);
				g.haritaGoster(blanks);
				System.out.println("You lost the game 😈");
				
				break;
			}
			
			System.out.println("Lucky step 👿👿");
			blanks[x][y].setVisible(true); // Now, this index is visible. We can see its content.
			
			if(isFinished(blanks) == true) {
				g.haritaGoster(blanks);
				System.out.println("Congrats you won 😒");
				break;
			}
			
			System.out.println("\n");
			
		}catch (Exception e) {
			
			System.out.println("Invalid index, try again");
			scanner.nextLine();
			continue;
		}
		}
		
		
	}
	
	boolean isFinished(Blanks[][] blanks) {
		
		for(int i = 0; i<blanks.length; i++) {
			for(int j = 0; j<blanks.length; j++) {
				
				if(blanks[i][j].visible == false && !blanks[i][j].varMi.equals("yes")) { // this means the game is not over yet.
					return false; 
				}
			}
		}
		
		return true; // game is over
	}
}
