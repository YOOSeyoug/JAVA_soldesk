package chapter20;

public class ThreadMain_01 {

	public static void main(String[] args) {
		
		Thread_01 t = new Thread_01();
		//t.run(); //�������� ������ ������ ������ ������ �� �� ����
		t.start(); //������� start�޼���� run�޼��� ȣ���Ͽ� ���� ����
		System.out.println("main ����");

	}

}
