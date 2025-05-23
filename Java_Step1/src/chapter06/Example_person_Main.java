package chapter06;

public class Example_person_Main {

	public static void main(String[] args) {
		
		Example_person body = new Example_person();
		
		body.name = "홍길동";
		body.height = 180f;
		body.weight = 80f;
		
		System.out.println(body.name+"님의 키는 "+body.height+"cm이고, 몸무게는 "+body.weight+"kg 입니다.");
		System.out.println("-------------------------------------------------------");

		Example_person body2 = new Example_person("홍길동");
		body2.height = 180f;
		body2.weight = 80f;
		
		System.out.println(body2.name+"님의 키는 "+body2.height+"cm이고, 몸무게는 "+body2.weight+"kg 입니다.");
		System.out.println("-------------------------------------------------------");
		
		Example_person body3 = new Example_person("홍길동", 180, 80);
		
		System.out.println(body3.name+"님의 키는 "+body3.height+"cm이고, 몸무게는 "+body3.weight+"kg 입니다.");
	}

}
