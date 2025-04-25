package Test02_Java2.ApplianceClass02;

public abstract class Appliance {

	public String name;
	
	public void powerOn() {
		System.out.println("전원을 가동합니다.");
	}
	
	public abstract void operate();
	
}
