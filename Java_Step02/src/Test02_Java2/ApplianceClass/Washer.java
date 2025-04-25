package Test02_Java2.ApplianceClass;

public class Washer extends Appliance {
	
	public Washer() {
		this.name="세탁기";
	}

	@Override
	public void operate() {
		System.out.println("세탁을 시작합니다.");
	}
	
	

}
