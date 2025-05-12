package chapter18.lambda;

public class StringConCatImpleMain_04 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//�ν��Ͻ� ���� => ��ü
		System.out.println("�ν��Ͻ� ���� => ��ü");
		StringConCatImple concat1 = new StringConCatImple();
		concat1.makeString(s1, s2);
		
		System.out.println();
		
		//���ٽ� ���
		System.out.println("--- ���ٽ� ����(�͸��� �޼���) ---");
		StringConcat concat2 = (s, v) -> System.out.println(s+", "+v);
		concat2.makeString("Hello", "World");
		
		System.out.println();
		//�͸��� ���� Ŭ���� ���
		System.out.println("--- �͸��� ���� Ŭ���� ���� ---");
		//Imple ������
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		concat3.makeString(s1,s2);
		
		
	}

}
