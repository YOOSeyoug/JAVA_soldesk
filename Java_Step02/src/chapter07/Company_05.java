package chapter07;

public class Company_05 {
	
	// singleton : ��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company_05 instance=new Company_05();
	
	//�Ϲ����� ��ü����
	public Company_05() {
		
	}//�⺻ ������
	
	public static Company_05 getInstance() {
		
		//����ó�� -> ������ ��ü�� ������ ��ü ����
		if(instance == null) {
			instance = new Company_05();
		}
		
		return instance;
	}
	

}
