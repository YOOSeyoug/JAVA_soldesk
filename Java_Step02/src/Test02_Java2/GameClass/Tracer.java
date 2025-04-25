package Test02_Java2.GameClass;

public class Tracer extends GameCharacter {
	
	@Override
	public void skill() {
		System.out.println("점멸을 사용합니다.");
	}
	
	@Override
	public void lethul() {
		System.out.println("펄스폭탄을 사용합니다.");
	}
	
}
