package chapter08;

public class TV extends Appliance {
	
	public TV(String brand) {
		super(brand);
	}

	@Override
	void turnOff() {
		super.turnOff(); //�θ� ���� ����
		System.out.println("TV�� �����մϴ�.");
	}
	
	
	//tv�� ����� appliance ��ӹޱ�
	
	
	

}
