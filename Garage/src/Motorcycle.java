public class Motorcycle extends Vehicle {

	private int noOfHelmets;

	public Motorcycle(int ID, String vehicleType, int noOfHelmets) {
		super(ID, vehicleType);
		this.ID = ID;
		this.vehicleType = vehicleType;
		this.noOfHelmets = noOfHelmets;	
		// TODO Auto-generated constructor stub
	}


	public int getNoOfHelmets() {
		return noOfHelmets;
	}

	public void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}
	
}