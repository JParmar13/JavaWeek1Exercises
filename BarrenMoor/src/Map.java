import java.util.Arrays;
import java.util.Random;

public class Map {
	
	int chestx, chesty;
	int [][] map = new int[5][5];
//	
//	public Map(int chesty, int chestx) {
//		super();
//		this.chestx = chestx;
//		this.chesty = chesty;
//		
//	}

	public Map() {
		// TODO Auto-generated constructor stub
		setChestLocationRandom();
	}

	public int getChestx() {
		return chestx;
	}

	public void setChestx(int chestx) {
		this.chestx = chestx;
	}

	public int getChesty() {
		return chesty;
	}

	public void setChesty(int chesty) {
		this.chesty = chesty;
	}
	
	//Set the chests location
	public void setChestLocation(int a, int b) {
		map[a][b] = 3;
		chestx = a;
		chesty = b;
	}	
	
	//Set the players location
	public void setPlayerLocation(Player p,int x, int y) {
		map[p.locationx][p.locationy] = 0;
		map[x][y] = 2;
		p.locationx = x;
		p.locationy = y;
				
	}
	//Generate random coordinates for the player to be set to
	public void setPlayerLocationRandom(Player p) {
		Random randomNS = new Random();
		int lowerLimit = 0;
		int upperLimit = 5;
		int resultNS = randomNS.nextInt(upperLimit-lowerLimit);		
		int resultEW = randomNS.nextInt(upperLimit-lowerLimit);	
		setPlayerLocation(p, resultNS,resultEW);		
	}
	//Generate random coordinates for the player to be set to
	public void setChestLocationRandom() {
		Random randomNS = new Random();
		int lowerLimit = 0;
		int upperLimit = 5;
		int resultChestNS = randomNS.nextInt(upperLimit-lowerLimit);
		int resultChestEW = randomNS.nextInt(upperLimit-lowerLimit);
		setChestLocation(resultChestNS, resultChestEW);
	
	}
	
	//Nested for loop to see where the player and chest is
	
	@Override 
	public String toString() {
		return (Arrays.deepToString(map));
	}
	
	
	
	
}