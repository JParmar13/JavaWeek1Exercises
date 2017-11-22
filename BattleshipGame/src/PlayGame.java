import java.util.Scanner;

public class PlayGame {

	public boolean checkHit(Player player, BattleshipMap map) {
		
		int x = 0;
		int y = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter X coordinate to hit opponent ship");
		x = input.nextInt();
		System.out.println("Enter Y coordinate to hit opponent ship");
		y = input.nextInt();

		if (x > map.map.length || x < 0 || y > map.map.length || y < 0) {

			System.out.println("out of bounds");
			return true;

		} else if (map.map[y][x] == 1) {

			System.out.println("Hit opponents Ship");
			map.map[y][x] = 9;
			map.populateMap();
			return true;
			
		}else {
			
			System.out.println("miss");
			map.map[y][x] = 8;
			map.populateMap();
			return false;
		}
	}
}
// public void play() {
//
// boolean checkHit = true;
// boolean GameWinner = false;
//
//
// checkHit(currentPlayer, m.map2);
//
//
// if (checkHit == false) {
// if (currentPlayer.equals(m.player1)) {
// checkHit(m.player2, m.map1);
//
// }
//
// else {
// checkHit(m.player1, map2);
// }
// }
//
//
// }
//
// public boolean checkHit(Player player, BattleshipMap map) {
//
// int x = 0;
// int y = 0;
// Scanner input = new Scanner(System.in);
//
// System.out.println("Enter X coordinate to hit opponent ship");
// x = input.nextInt();
// System.out.println("Enter Y coordinate to hit opponent ship");
// y = input.nextInt();
//
// if (x > map.map.length || x < 0 || y > map.map.length || y < 0) {
//
// System.out.println("out of bounds");
// play();
//
// } else if (map.map[y][x] == 1) {
//
// System.out.println("Hit opponents Ship");
// map.map[y][x] = 9;
// map.populateMap();
// play();
//
// } else {
//
// System.out.println("Miss. opponents turn");
// map.map[y][x] = 8;
// map.populateMap();
//
// return false;
// }
// return true;
// }
