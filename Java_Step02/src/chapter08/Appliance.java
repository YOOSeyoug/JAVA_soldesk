package chapter08;
// �θ� Ŭ����
public class Appliance {
	
	String brand;
	
	//�����ڷ� �ʱ�ȭ(brand)
	
	public Appliance(String brand) {
		this.brand=brand;
	}

	void turnOn() {
		System.out.println(brand+" ������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println(brand+" ������ ���ϴ�.");
	}
	
}
