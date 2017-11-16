public class Car extends Vehicle {
	
	private int noOfWheels;
	
	public Car(int ID, String vehicleType, int noOfWheels) {
		super(ID, vehicleType);
		this.ID = ID;
		this.vehicleType = vehicleType;
		this.noOfWheels = noOfWheels;
		// TODO Auto-generated constructor stub
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	
}