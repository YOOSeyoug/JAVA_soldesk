package chapter09;

//추상 메서드가 단 하나라도 있으면 추상 클래스가 된다.
public abstract class Computer {
	
	//추상 메서드 -> body가 없음
	public abstract void display(); // 하위 클래스 구현에서 구현하여 사용하세요.
	public abstract void typing(); //
	
	
	// 일반 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
