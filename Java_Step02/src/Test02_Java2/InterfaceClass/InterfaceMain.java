package Test02_Java2.InterfaceClass;

public class InterfaceMain {

	public static void main(String[] args) {
		
		D dClass = new D();
		
		A a = new D();
		
		B b = new D();
		
		C c = new D();
		
		D d = new D();
		
		 System.out.println("== D ��ü dClass ==");
	     dClass.a();
	     dClass.b();
	     dClass.c();

	     System.out.println("\n== A �������̽� a ==");
	     a.a();
	     // a.b(); // �Ұ���
	     // a.c(); // �Ұ���

	     System.out.println("\n== B �������̽� b ==");
	     b.b();
	     // b.a(); // �Ұ���
	     // b.c(); // �Ұ���

	     System.out.println("\n== C �������̽� c ==");
	     c.a();
	     c.b();
	     c.c();
	}

}
