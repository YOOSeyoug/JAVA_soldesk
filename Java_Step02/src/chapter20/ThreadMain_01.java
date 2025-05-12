package chapter20;

public class ThreadMain_01 {

	public static void main(String[] args) {
		
		Thread_01 t = new Thread_01();
		//t.run(); //독립적인 공간은 있지만 스레드 역할을 할 수 없음
		t.start(); //스레드는 start메서드로 run메서드 호출하여 동시 실행
		System.out.println("main 종료");

	}

}
