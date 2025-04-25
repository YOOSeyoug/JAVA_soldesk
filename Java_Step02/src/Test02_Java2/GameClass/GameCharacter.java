package Test02_Java2.GameClass;

public abstract class GameCharacter {
	
	public final void fight() {
		gameStart();
		skill();
		lethul();
		gameClose();
	}
	
	public void gameStart() {
		System.out.println("게임을 시작합니다.");
	}
	
	public void gameClose() {
		System.out.println("게임을 종료합니다.");
	}
	
	public abstract void skill();
	public abstract void lethul();

}
