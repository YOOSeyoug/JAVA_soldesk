package New_Test.Machine;

public class User {
	
	//멤버변수
	public String name;
	int money;
	
	public User() {
	}
	
	public User(String name, int money) {
		this.name=name;
		this.money=money;
	}
	
	public void buyDrink(Drink drink, VendingMachine machine) {
		if(money<drink.price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			money-=drink.price;
			machine.totalMoney+=drink.price;
			System.out.println(name+"님이 "+drink.name+"을 구매하셨습니다.");
		}
	}
	
	public void showMoney() {
		System.out.println(name+"님의 잔액은 "+money+"원 입니다.");
	}
	

}
