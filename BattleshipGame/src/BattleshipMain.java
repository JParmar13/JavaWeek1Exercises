import java.util.Scanner;

public class BattleshipMain {
	Player player1 = new Player();
	Player player2 = new Player();

	public static void main(String[] args) {
		BattleshipMain m = new BattleshipMain();
		BattleshipMap map1 = new BattleshipMap();
		BattleshipMap map2 = new BattleshipMap();

		map1.populateMap();

		map2.populateMap();
		Scanner in = new Scanner(System.in);

		System.out.println("Player 1, assign your positions");
		m.player1.playerSetup(map1);
		System.out.println("Prepare for battle ships, player 1!");

		System.out.println("Player 2, assign your positions");
		m.player2.playerSetup(map2);
		System.out.println("Prepare for battle ships, player 2!");

		map1.populateMap();
		System.out.println("");
		map2.populateMap();

		PlayGame game = new PlayGame();

		
		boolean check = true;
		
		while (true) {
			
			if (check) {
				System.out.println("player 1 turn");
				
				if(game.checkHit(m.player1, map2)) {
					check = !check;
				}
				check = !check;
			}
			else {
				System.out.println("player 2 turn");
				
				if (game.checkHit(m.player2, map1)) {
					check = !check;
				}
				check = !check;
			}
			
		}
	}



}