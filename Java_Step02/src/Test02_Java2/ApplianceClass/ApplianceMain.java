package Test02_Java2.ApplianceClass;

public class ApplianceMain {

	public static void main(String[] args) {
		Washer washer = new Washer();
		AirCondition aircondition = new AirCondition();
		
		runAppliance(washer);
		runAppliance(aircondition);
	}
	
	public static void runAppliance(Appliance appliance) {
		appliance.powerOn();
		appliance.operate();
		
	}

}
