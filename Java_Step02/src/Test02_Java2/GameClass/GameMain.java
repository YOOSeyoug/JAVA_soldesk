package Test02_Java2.GameClass;

public class GameMain {

	public static void main(String[] args) {
		
		System.out.println("===Ʈ���̼��� ������ �����մϴ�.===");
		GameCharacter tracer = new Tracer();
		tracer.fight();
		System.out.println();
		
		System.out.println("===��ÿ�� ������ �����մϴ�.===");
		GameCharacter lucio = new Lucio();
		lucio.fight();
			
		
		
	}

}
