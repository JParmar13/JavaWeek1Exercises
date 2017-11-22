
public class BattleshipMap {

	int[][] map = new int[3][3];
	
	
	public void populateMap() {
		
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			} 
			System.out.println();
		}
		
	}
	
	
}
  