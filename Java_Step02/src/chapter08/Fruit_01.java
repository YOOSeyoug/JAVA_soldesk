package chapter08;

public class Fruit_01 {
	
	private String sort; //�з�
	private String season; //��������
	
	//������
	
	//�ʱ�ȭ
	public void Set1(String a, String b) {
		sort=a;
		season=b;
	}
	
	//���
	public void Disp1() {
		System.out.println("�з�: "+sort);
		System.out.println("����: "+season);
	}

}
