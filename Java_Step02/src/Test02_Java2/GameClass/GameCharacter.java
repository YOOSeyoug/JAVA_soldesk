package Test02_Java2.GameClass;

public abstract class GameCharacter {
	
	public final void fight() {
		gameStart();
		skill();
		lethul();
		gameClose();
	}
	
	public void gameStart() {
		System.out.println("������ �����մϴ�.");
	}
	
	public void gameClose() {
		System.out.println("������ �����մϴ�.");
	}
	
	public abstract void skill();
	public abstract void lethul();

}
