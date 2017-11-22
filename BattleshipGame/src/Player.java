import java.util.Scanner;

public class Player {

	PatrolBoat p;
	
	
	public void playerSetup(BattleshipMap bm) {
		Scanner in = new Scanner(System.in);
		int x = 0;
		int y = 0;

		System.out.println("Please enter the coordinates for your tail end of your patrol boat unit:");
		System.out.println("Enter X co-ordinate value (0-2)");
		x = in.nextInt();
		System.out.println("Enter Y co-ordinate value (0-2)");
		y = in.nextInt();
		

		setPatrolBoat(bm, x, y);
 
		System.out.println("Enter the alignment for the boat (up,down,left,right):");
		
		 
		do {
		// Run this while check bounds is fine
			setPatrolBoatSecondPoint(in.next(), bm);
		
		}
		while (checkBounds(bm, x, y) == false);
		
	}

	public void setPatrolBoat(BattleshipMap bm, int x, int y) {

		if (x > bm.map.length || x < 0 || y > bm.map.length || y < 0) {

			System.out.println("out of bounds");
			playerSetup(bm);
		} else {

			p = new PatrolBoat(x, y);
			// map[p.locationx][p.locationy] = 0;
			bm.map[y][x] = 1;
			bm.populateMap();

		}
	}
 
	public void setPatrolBoatSecondPoint(String position, BattleshipMap bm) {
			
		switch (position) {
		case "up":
			p.setPatrolBoatY(p.getPatrolBoatY() - 1);
			
			break;
		case "down":
			p.setPatrolBoatY(p.getPatrolBoatY() + 1);

			break;
		case "left":
			p.setPatrolBoatX(p.getPatrolBoatX() - 1);

			break;
		case "right":
			p.setPatrolBoatX(p.getPatrolBoatX() + 1);
	
			break;
		default:
			System.out.println("Please enter correct direction (up,down,left,right)");
		}
	}
 
	public boolean checkBounds(BattleshipMap map, int x, int y) {

		if (p.getPatrolBoatX() >= map.map.length || p.getPatrolBoatX() < 0 || p.getPatrolBoatY() >= map.map.length || p.getPatrolBoatY() < 0) {

			System.out.println("out of bounds");
			
			p.setPatrolBoatX(x);
			p.setPatrolBoatY(y);
			
			System.out.println("Please re-enter a valid direction for the grid");
			
		return false;
		} else {

			map.map[p.getPatrolBoatY()][p.getPatrolBoatX()] = 1;
			map.populateMap();
		return true;
		}

	}

}
