package chapter08;

public class TV extends Appliance {
	
	public TV(String brand) {
		super(brand);
	}

	@Override
	void turnOff() {
		super.turnOff(); //부모 동작 유지
		System.out.println("TV를 종료합니다.");
	}
	
	
	//tv도 만들기 appliance 상속받기
	
	
	

}
