package chapter07;

public class Company_05 {
	
	// singleton : 객체를 단 하나만 생성하는 클래스
	private static Company_05 instance=new Company_05();
	
	//일반적인 객체생성
	public Company_05() {
		
	}//기본 생성자
	
	public static Company_05 getInstance() {
		
		//예외처리 -> 생성된 객체가 없으면 객체 생성
		if(instance == null) {
			instance = new Company_05();
		}
		
		return instance;
	}
	

}
