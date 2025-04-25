package Test02_Java2.ApplianceClass02;

public class Airconditioner extends Appliance {
	
	public Airconditioner() {
		this.name = "에어컨";
	}

	@Override
	public void operate() {
		System.out.println("냉방이 시작됩니다.");
	}

}
