package chapter20;

public class Thread_01 extends Thread{

	@Override
	public void run() {
		//���μ����� ���������� ����
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+"��° ������ ����");
		}
		
	}

	


}
