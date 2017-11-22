
public class PatrolBoat {

	private int size = 1;
	
	private int patrolBoatX;
	private int patrolBoatY;
	

	public PatrolBoat() {}
	public PatrolBoat(int patrolBoatX, int patrolBoatY) {
		super();
		
		this.patrolBoatX = patrolBoatX;
		this.patrolBoatY = patrolBoatY;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPatrolBoatX() {
		return patrolBoatX; 
	}
	public void setPatrolBoatX(int patrolBoatX) {
		this.patrolBoatX = patrolBoatX;
	}
	public int getPatrolBoatY() {
		return patrolBoatY;
	}
	public void setPatrolBoatY(int patrolBoatY) {
		this.patrolBoatY = patrolBoatY;
	}
		
}
