package chapter06;

public class StdInfo {
	
	//멤버변수 -> 여기저기서 쓸 멤버변수라면 초기화X
	
	public String studentName;
	public int grade;
	public int money;
	
	public StdInfo() {
	}
	
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	//버스 -> 매개변수에 클래스가 들어올 수 있음.
	public void takeBus(Bus bus) {
		bus.take(1400); //버스회사의 수입
		this.money-=1400; //학생 입장에서 지출
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1800); //지하철의 수입
		this.money-=1800; //학생 입장에서 지출
	}
	
	//잔액
	public void showinfo() {
		System.out.println(studentName+"님의 잔액은 "+money+"원 입니다.");
	}

}
