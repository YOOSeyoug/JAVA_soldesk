package chapter09;

public class PhoneMain {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); //�߻�Ŭ���� �̹Ƿ� ��ü ���� �ȵ�
		
		SmartPhone smartPhone = new SmartPhone("���ڹ�");
		
		System.out.println(smartPhone.owner+"��");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();

	}

}
