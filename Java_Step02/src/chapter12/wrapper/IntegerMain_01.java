package chapter12.wrapper;

public class IntegerMain_01 {

	public static void main(String[] args) {

		//Integer: ������ | int: �⺻��(�Լ� ���� ������ ���)
		Integer i = new Integer(100); //int i=100;
		//Integer ���� �޼��带 ����ؾ� �ϰų�, ��ȭ��ȣ ���� String���� ������ �� Integer���
		
		Integer num = 100; //����ڽ� -> �Ϲ� �ڷḦ Ŭ������ ����(������ ����)
		
		int iNum = num.intValue(); //��ڽ� ->Ŭ���� �� �ڷḦ �Ϲ������� -> (������ -> �Ϲ���)
		
		int jNum = 200;
		
		//��ڽ�(Integer -> int)
		int sum=iNum+jNum;
		int total = num.intValue() + jNum;
		System.out.println(sum);
		System.out.println(total);
		
		//����ڽ�(int -> integer)
		Integer x = jNum;
		Integer y = Integer.valueOf(jNum);
		System.out.println(x);
		System.out.println(y);
		
		
		

	}

}
