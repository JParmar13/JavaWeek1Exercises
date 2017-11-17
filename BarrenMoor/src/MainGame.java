import java.util.Scanner;

public class MainGame {

	// static Player playerOne = new Player();
	// static Map m = new Map();
	Map gameMap = new Map();

	public static void main(String[] args) {

		MainGame mg = new MainGame();

		Player p = new Player();
		mg.gameMap.setPlayerLocationRandom(p);
		Scanner keyboardInput = new Scanner(System.in);
		mg.gridSetting();
		p.playerName = mg.setPlayerName(keyboardInput, p);
		mg.greetPlayer(p);

		while ((p.locationx != mg.gameMap.chestx) || (p.locationy != mg.gameMap.chesty)) {
			System.out.println("Input direction (N, E, S, W) ");
			String input = keyboardInput.nextLine();
			mg.playerMovement(input, p, mg);
			mg.gridSetting();
		}

		System.out.println("You got the treasure, you can go home now, be free " + p.playerName);

	}

	public void gridSetting() {
		for (int i = 0; i < gameMap.map.length; i++) {
			for (int j = 0; j < gameMap.map[i].length; j++) {
				System.out.print(gameMap.map[i][j]);
			}
			System.out.println();
		}
	}

	// Method to allow player to move NESW to find the chest
	private void playerMovement(String keyboardInput, Player p, MainGame mg) {

		switch (keyboardInput) {
		case "N":
			mg.gameMap.setPlayerLocation(p, p.locationx + 1, p.locationy);
			break;
		case "E":
			mg.gameMap.setPlayerLocation(p, p.locationx, p.locationy + 1);
			break;
		case "S":
			mg.gameMap.setPlayerLocation(p, p.locationx - 1, p.locationy);
			break;
		case "W":
			mg.gameMap.setPlayerLocation(p, p.locationx, p.locationy - 1);
			break;
		default:
			System.out.println("Wrong input, try one of the suggested movements");
		}
	}

	// Set the players name
	public String setPlayerName(Scanner keyboardInput, Player playerName) {
		System.out.println("Welcome, input your players name :");
		String newPlayerName = keyboardInput.nextLine();
		return newPlayerName;
	}

	public void greetPlayer(Player p) {

		System.out.println("Welcome to Barren More, " + p.playerName);
		System.out.println("Please use the following commands to navigate");
		System.out.println("N to navigate north, E to navigate east, S to navigate south, W to navigate west");

	}

}