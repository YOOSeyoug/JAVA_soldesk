package chapter08;

public class Company {

	public static void main(String[] args) {
		
		Employee_09 emp = new Employee_09("������", 4000);
		emp.work();
		emp.getInfo();
		
		Manager mgr = new Manager("�ڰ���", 5000, "����");
		mgr.work();
		mgr.getInfo();
		mgr.approveLeave("������");
		
		//������
		Employee_09 emp2 = new Manager("������", 5500, "����");
		emp2.work();
		emp2.getInfo();
		//emp2.approveLeave("������"); <-������ ����(��ü�� Employee_09 Ÿ���̶� Manager ���� ����� ��� �Ұ�)
		

	}

}
