package chapter20;

public class ThreadMain_02 {

	public static void main(String[] args) {
		
		
		Thread_02 t1 = new Thread_02(); //0~9������ ��Ұ� ����� temp�迭�� ������
		
		t1.start(); //Thread1:�ҿ�ð� 10��
		
		//�����尡 �������϶��� �ð����̸� �ΰ� ����
		//Thread2
		try {
			Thread.sleep(5000); //11��
			System.out.println("���α׷��� ����˴ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
