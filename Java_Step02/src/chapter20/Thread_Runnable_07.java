package chapter20;

public class Thread_Runnable_07 implements Runnable{

	public static void main(String[] args) {
		
		//�Ϲ� ����(���ν�����)
		System.out.println("���� Ŭ���� ����!");
		Thread_Runnable_07 t1 = new Thread_Runnable_07();
		t1.run();
		System.out.println("--------------------------");
		
		Thread mThread = new Thread(t1); //�Ϲ����� t1��ü�� ������� ��ȯ
		mThread.start();
		System.out.println("���� Ŭ���� ����!");
        
	}
//-----------------------------------------------------
	@Override
	public void run() {
		System.out.println("run() �޼��� ����");
		first(); //�޼��� ȣ��
	}
	
	private void first() {
		System.out.println("first() �޼��� ����");
		second();
	}
	
	private void second() {
		System.out.println("second() �޼��� ����");
	}

}
