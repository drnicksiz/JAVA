package MineSweeperGame;

public class Main {

	public static void main(String[] args) {
		
		Blanks[][] harita = new Blanks[10][10];
		
		Map map = new Map();
		
		map.haritaOlustur(harita);
		
		Show goruntu = new Show();
		Game game = new Game(harita,goruntu);
		
		game.startGame();

	}

}
