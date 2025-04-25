package chapter08;

public class ApplianceMain {

	public static void main(String[] args) {
		/*
		Appliance a1 = new Washer("LG");
		
		a1.turnOn();
		
		Appliance a2 = new TV("»ï¼º");
		
		a2.turnOff();
		*/
		
		Appliance[] list = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new TV("Samsung");
		list[2] = new Washer("Daewoo");
		
		for(Appliance a:list) {
			a.turnOn();
		}

	}

}
