
public class Player {

	PatrolBoat p;

	public void setPatrolBoat(BattleshipMap bm, int x, int y) {

		if (x > bm.map.length || x < 0 || y > bm.map.length || y < 0) {

			System.out.println("out of bounds");
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
 
	public boolean checkBounds(BattleshipMap bm, int x, int y) {

		if (p.getPatrolBoatX() >= bm.map.length || p.getPatrolBoatX() < 0 || p.getPatrolBoatY() >= bm.map.length || p.getPatrolBoatY() < 0) {

			System.out.println("out of bounds");
			
			p.setPatrolBoatX(x);
			p.setPatrolBoatY(y);
			
			System.out.println("Please re-enter a valid direction for the grid");
			
		return false;
		} else {

			bm.map[p.getPatrolBoatY()][p.getPatrolBoatX()] = 1;
			bm.populateMap();
		return true;
		}

	}

}
