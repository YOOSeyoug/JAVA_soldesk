package chapter09;

public class GameMain {

	public static void main(String[] args) {
		
		System.out.println("====���� ����====");
		GameCharacter warrior = new Warrior();
		warrior.fight();
		System.out.println("\n====������ ����====");
		GameCharacter wizard = new Wizard();
		wizard.fight();
		

	}

}
