package chapter08;

public class SuperMain {

	public static void main(String[] args) {
		
		Paprika obj = new Paprika();
		
		obj.Set1("피망류", "여름", "노랑파프리카"); //부모 클래스에 있는 메서드
		obj.Set2("빨강", 8000, "빨강파프리카"); //자식 클래스에 있는 메서드
		
		obj.Disp1();
		obj.Disp2();

	}

}
