package chapter06;

public class Bus {
	
	//멤버변수 -> 여기저기서 쓸 멤버변수라면 초기화X
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus() { //쓰려면 꺼내놔야함
	}
	
	//this -> 매개변수
	//생성자 오버로딩
	public Bus(int busNumber) {
		this.busNumber=busNumber; //버스 번호
	}
	
	//메서드
	public void take(int money) { //승객이 낸 돈
		this.money+=money; //버스 수입
		passengerCount++; //승객의 수 증가
	}
	
	public void showinfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"명이고, 수익은 "+money+"원 입니다.");
	}

}
