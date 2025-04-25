package Test02_Java2.VehicleClass;

public class VehicleMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		Bike bike = new Bike();
		
		vehicleMove(car);
		vehicleMove(bike);

	}
	
	public static void vehicleMove(Vehicle vehicle) {
		
		vehicle.move();
		vehicle.start();
	}

}
