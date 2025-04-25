package Test02_Java2.InterfaceClass;

public class InterfaceMain {

	public static void main(String[] args) {
		
		D dClass = new D();
		
		A a = new D();
		
		B b = new D();
		
		C c = new D();
		
		D d = new D();
		
		 System.out.println("== D 객체 dClass ==");
	     dClass.a();
	     dClass.b();
	     dClass.c();

	     System.out.println("\n== A 인터페이스 a ==");
	     a.a();
	     // a.b(); // 불가능
	     // a.c(); // 불가능

	     System.out.println("\n== B 인터페이스 b ==");
	     b.b();
	     // b.a(); // 불가능
	     // b.c(); // 불가능

	     System.out.println("\n== C 인터페이스 c ==");
	     c.a();
	     c.b();
	     c.c();
	}

}
