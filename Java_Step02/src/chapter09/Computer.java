package chapter09;

//�߻� �޼��尡 �� �ϳ��� ������ �߻� Ŭ������ �ȴ�.
public abstract class Computer {
	
	//�߻� �޼��� -> body�� ����
	public abstract void display(); // ���� Ŭ���� �������� �����Ͽ� ����ϼ���.
	public abstract void typing(); //
	
	
	// �Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
