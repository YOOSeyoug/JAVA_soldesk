package chapter20;

public class DaemonThread_09 implements Runnable {
	
	static boolean autoSave = false;

	public static void main(String[] args) {
		
		DaemonThread_09 dm = new DaemonThread_09();
		Thread t = new Thread(dm); //run()�� start()�� ��ȯ
		//���� ������� ���� �����尡 ����Ǹ� �ڵ� �����
		t.setDaemon(true); //���� ������� ��ȯ
		t.start(); //���󽺷��� ����
		
		for(int i=0; i<15; i++) {
			//���ν�����
			try {
				Thread.sleep(1000); //1��
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(i); //����
			if(i==3) {
				autoSave=true;
			}
			
		}

	}

	//----------------------------------------------------
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000); //3��
			} catch (Exception e) {
				e.printStackTrace();
			}//try
			
			if(autoSave) {
				System.out.println("�ڵ����� �Ǿ����ϴ�.");
			}
		}//while
		
	}
	

}
