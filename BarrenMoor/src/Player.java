public class Player {
	
	String playerName;
	int locationx, locationy;
	
	public Player(String playerName, int locationx,int locationy) {
		super();
		this.playerName = playerName;
		this.locationx = locationx;
		this.locationy = locationy;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getLocationx() {
		return locationx;
	}

	public void setLocationx(int locationx) {
		this.locationx = locationx;
	}

	public int getLocationy() {
		return locationy;
	}

	public void setLocationy(int locationy) {
		this.locationy = locationy;
	}
		
}