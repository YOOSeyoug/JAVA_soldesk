package chapter08;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1(); // 부모
		child.method2(); // 자신
		child.method3(); // 자신
		System.out.println();
		
		Parent parent1 = child;
		parent1.method1(); // 부모
		parent1.method2(); // 자신
		System.out.println();
		//메서드3은 자식 클래스에서 자체적으로 만든 것이기 때문에 parent 클래스에서는 가져오지 못함

		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2();
		
		
	}

}
