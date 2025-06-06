package chapter09;

public abstract class GameCharacter {

	//템플릿 메서드 : 전투게임 순서 정의
	
	public final void fight() {
		enterBattlefield(); //전투게임 시작
		atack(); //게임 -> 하위 클래스의 구현, 오버라이딩 반드시 필요
		useUItimate(); //아이템 사용 -> 하위 클래스 구현 필요
		leaveBattlefield(); //전투게임 종료
	}
	
	//공통 메서드
	private void enterBattlefield() {
		System.out.println("[입장] 소환사의 협곡에 오신 걸 환영합니다.");
	}
	
	private void leaveBattlefield() {
		System.out.println("[퇴장] 소환사가 전장을 떠났습니다.");
	}
	
	//하위 클래스가 반드시 구현해야 하는 추상메서드
	protected abstract void atack();
	protected abstract void useUItimate();


}
