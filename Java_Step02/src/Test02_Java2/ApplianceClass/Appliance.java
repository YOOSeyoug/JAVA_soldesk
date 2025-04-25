package Test02_Java2.ApplianceClass;

public abstract class Appliance {
	
	String name;
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public abstract void operate();

}
