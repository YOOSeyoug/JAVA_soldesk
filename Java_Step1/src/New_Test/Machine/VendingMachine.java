package New_Test.Machine;

public class VendingMachine {
	
	int totalMoney = 0;
	
	public void sellDrink(Drink drink) {
		totalMoney += drink.price;
	}
	
	public void showTotalMoney() {
		System.out.println("자판기 총 수익: "+totalMoney+"원");
	}
	
	

	

}
