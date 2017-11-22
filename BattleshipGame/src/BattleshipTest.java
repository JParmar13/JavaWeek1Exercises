import static org.junit.Assert.*;

import org.junit.Test;

public class BattleshipTest {

	BattleshipMap map = new BattleshipMap();
	Player testPlayer = new Player();
	@Test
	public void testPopulateMap() {
		
		map.populateMap();

	}

	@Test
	public void testBoatPlacementInput() {
		
		BattleshipMap map = new BattleshipMap();
		map.map[1][2] = 1;
		map.populateMap();
		System.out.println("");
	}
	
	@Test
	public void testCreatePlayerBoat() {

		BattleshipMap bm = new BattleshipMap();
	
		testPlayer.playerSetup(bm);
	}
	
	@Test
	public void testPLayGame() {


		
	}
}
 