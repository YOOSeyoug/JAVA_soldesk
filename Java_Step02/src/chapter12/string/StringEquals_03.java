package chapter12.string;

public class StringEquals_03 {

	public static void main(String[] args) {
		
		String strVar1 = new String("ȫ���");
		String strVar2 = "ȫ�浿";
		
		//�ܺ� �޸� �ּ� �� strVar == strVar2
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		//------------------------------------------
		//���� �� �� strVar == strVar2
		if(strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		

	}

}
