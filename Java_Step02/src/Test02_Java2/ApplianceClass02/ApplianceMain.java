package Test02_Java2.ApplianceClass02;

public class ApplianceMain {

	public static void main(String[] args) {
		
		Washer washer = new Washer();
		Airconditioner air = new Airconditioner();
		
		runAppliance(washer);
		runAppliance(air);

	}
	
	public static void runAppliance(Appliance appliance) {
		
		appliance.powerOn();
		appliance.operate();
		
	}

}
