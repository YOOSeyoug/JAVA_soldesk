package chapter08;

public class Student extends People{
	
	public int studentNo;

	//�����ε� �Ǿ�����. �θ� Ŭ����, �ڽ� �� ���ʷ� �ʱ�ȭ
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //�����ε��� �θ�Ŭ������ �����ڸ� ȣ���Ͽ� �ʱ�ȭ��
		this.studentNo = studentNo;
	}
	

	
	
	
}
