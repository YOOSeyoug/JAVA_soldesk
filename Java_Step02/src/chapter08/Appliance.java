package chapter08;
// 부모 클래스
public class Appliance {
	
	String brand;
	
	//생성자로 초기화(brand)
	
	public Appliance(String brand) {
		this.brand=brand;
	}

	void turnOn() {
		System.out.println(brand+" 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println(brand+" 전원을 끕니다.");
	}
	
}
