package chapter18.lambda;

public class AddMain_01 {

	public static void main(String[] args) {
		//Lambda: �޼��� �̸��� ���� -> �Ű������� Ȱ���� ���๮�� ����
		Add addF = (x,y) -> x+y;
		
		System.out.println(addF.add(3, 5));
		

	}

}
