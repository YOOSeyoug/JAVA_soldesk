package Test02_Java2.ApplianceClass;

public class AirCondition extends Appliance {
	
	public AirCondition() {
		this.name="에어컨";
	}

	@Override
	public void operate() {
		System.out.println("냉방을 시작합니다.");
	}
	
	

}
