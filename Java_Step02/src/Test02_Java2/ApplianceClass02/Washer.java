package Test02_Java2.ApplianceClass02;

public class Washer extends Appliance {

	public Washer() {
		this.name = "세탁기";
	}
	
	@Override
	public void operate() {
		System.out.println("세탁이 시작됩니다.");
	}
	
	
	

}
