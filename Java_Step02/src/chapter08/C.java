package chapter08;

public class C extends A {
	
	public C() {
		super();
		this.field="value";
		this.method();
	}

	public static void main(String[] args) {
		C c = new C(); //�ڽ�Ŭ����
		c.method(); //�θ�Ŭ����

	}

}
