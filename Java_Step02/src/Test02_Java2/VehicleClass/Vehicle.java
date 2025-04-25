package Test02_Java2.VehicleClass;

public abstract class Vehicle {
	
	public String type;
	
	public void start() {
		System.out.println("시동을 겁니다.");
	}
	
	public abstract void move();

}
