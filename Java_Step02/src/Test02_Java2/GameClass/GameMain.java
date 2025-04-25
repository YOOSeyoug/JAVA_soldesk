package Test02_Java2.GameClass;

public class GameMain {

	public static void main(String[] args) {
		
		System.out.println("===트레이서로 게임을 시작합니다.===");
		GameCharacter tracer = new Tracer();
		tracer.fight();
		System.out.println();
		
		System.out.println("===루시우로 게임을 시작합니다.===");
		GameCharacter lucio = new Lucio();
		lucio.fight();
			
		
		
	}

}
