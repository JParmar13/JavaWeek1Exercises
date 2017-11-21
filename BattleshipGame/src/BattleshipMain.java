import java.util.Scanner;

public class BattleshipMain {

	public static void main(String[] args) {

		Player player1 = new Player();
		Player player2 = new Player();
		BattleshipMain bsMain = new BattleshipMain();
		
		BattleshipMap map1 = new BattleshipMap();
		map1.populateMap();

		BattleshipMap map2 = new BattleshipMap();
		map2.populateMap();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Player 1, assign your positions");
		bsMain.playerSetup(player1, map1);
		System.out.println("Prepare for battle ships, player 1!");
		
		System.out.println("Player 2, assign your positions");
		bsMain.playerSetup(player2, map2);
		System.out.println("Prepare for battle ships, player 2!");
		
		map1.populateMap();
		System.out.println("");
		map2.populateMap();
		
	}

	private void playerSetup(Player player1, BattleshipMap map) {
		Scanner in = new Scanner(System.in);
		int x = 0;
		int y = 0;

		System.out.println("Please enter the coordinates for your tail end of your patrol boat unit:");
		System.out.println("Enter X co-ordinate value (0-2)");
		x = in.nextInt();
		System.out.println("Enter Y co-ordinate value (0-2)");
		y = in.nextInt();

		player1.setPatrolBoat(map, x, y);

		System.out.println("Enter the alignment for the boat (up,down,left,right):");
		
		
		do {
		// Run this while check bounds is fine
		player1.setPatrolBoatSecondPoint(in.next(), map);
		
		}
		while (player1.checkBounds(map, x, y) == false);
		
		in.close();
	}
	
}