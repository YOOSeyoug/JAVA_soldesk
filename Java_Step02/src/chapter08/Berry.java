package chapter08;

//��� Ű����: extends
public class Berry extends Fruit_01{

	private String name;
	private String size;
	
	//�ʱ�ȭ
		public void Set2(String a, String b) {
			name=a;
			size=b;
		}
		
		//���
		public void Disp2() {
			System.out.println("�����̸�: "+name);
			System.out.println("ũ��: "+size);
		}
	
	
}
