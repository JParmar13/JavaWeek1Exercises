import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicleListing = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		Garage vManager = new Garage();

		Car rover = new Car(3, "Car", 3);
		Bus megabus = new Bus(2, "Bus", 20);
		Motorcycle vroomvroom = new Motorcycle(1, "Motorcycle", 2);

		vManager.addVehicle(rover);
		vManager.addVehicle(megabus);
		vManager.addVehicle(vroomvroom);
	
		vManager.removeVehicle(2);
		
		vManager.calculateBill();
		String vehtype = "Bus";
		
		int value = vManager.specialItemCost(vehtype, 20);
		System.out.println("Your " + vehtype + " special item costs " + value + " to repair");

	}

	public void emptyGarage() {
		ArrayList<Vehicle> emptyVehicleListing = new ArrayList<Vehicle>();
		vehicleListing = emptyVehicleListing;
	}

	public void removeVehicle(int ID) {
		for(int i = 0; i < vehicleListing.size(); i++) {
			if (vehicleListing.get(i).ID == ID) {		
				vehicleListing.remove(i);
			}
		}
		
//		for (Vehicle vehicle : vehicleListing) {
//			System.out.println(vehicle.ID + " " + ID);
//			if (vehicle.ID == ID) {
//				System.out.println("found");
//				vehicleListing.remove(vehicle);
//				vehicleListing.remove(0);
//			}
//		}

	}
	


	public void displayGarage() {
		for (Vehicle vehicle : vehicleListing) {
			System.out.println(vehicle);
		}

	}

	public void addVehicle(Vehicle vehicle) {
		vehicleListing.add(vehicle);
	}

	public void calculateBill() {
		for (Vehicle vehicle1 : vehicleListing) {
			if (vehicle1.vehicleType.equals("Car")) {
				System.out.println("Your vehicle bill for your Car is 70");
			} else if (vehicle1.vehicleType.equals("Bus")) {
				System.out.println("Your vehicle bill for your Bus is 100");
			} else if (vehicle1.vehicleType.equals("Motorcycle")) {
				System.out.println("Your vehicle bill fr your Motorcycle is 85");
			}
			else {
				System.out.println("We don't deal with these types, no fix, no bill");
				}
			}
		}
	
	public int specialItemCost(String vehType, int specialItem) {
		
		switch (vehType) {
		case "Car": 
			return specialItem * 10;
		
		case "Bus": 
			return specialItem * 20;
		
		case "Motorcycle": 
			return specialItem * 5;
		
		default : return 0;
		}
		

	}

}