public class Bus extends Vehicle {

	private int noOfToilets;

	public Bus(int ID, String vehicleType, int noOfToilets) {
		super(ID, vehicleType);
		this.ID = ID;
		this.vehicleType = vehicleType;
		this.noOfToilets = noOfToilets;
		
		// TODO Auto-generated constructor stub
	}

	public int getNoOfToilets() {
		return noOfToilets;
	}

	public void setNoOfToilets(int noOfToilets) {
		this.noOfToilets = noOfToilets;
	}
	
}