package chapter20;

public class Thread_Runnable_08 implements Runnable{

	public static void main(String[] args) {
		
		//�Ϲ� ����(���ν�����)
		System.out.println("���� Ŭ���� ����!");
		Thread_Runnable_08 t1 = new Thread_Runnable_08();
		Thread mThread = new Thread(t1); //�Ϲ����� t1��ü�� ������� ��ȯ
		mThread.start();
		
		try {
			mThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
