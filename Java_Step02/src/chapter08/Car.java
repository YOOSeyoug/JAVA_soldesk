package chapter08;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
	}
	
	//Override�� �Ұ���
	public final void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		speed=0;
	}
	
	
}
