package chapter09;

public abstract class Phone {
	
	public String owner;
	
	//��ӽ� �θ��� �����ڸ� ���
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}

}
