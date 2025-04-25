package New_Test.Machine;

import java.util.Scanner;

public class MachineMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User ruby = new User("루비", 5000);
		User sapa = new User("사파이어", 7000);
		
		Drink cola = new Drink("콜라", 1300);
		Drink cider = new Drink("사이다", 1200);
		Drink fanta = new Drink("환타", 1000);
		
		//자판기 객체 생성
		VendingMachine vm = new VendingMachine();
		
		System.out.println("=== 유쾌 자판기 ===");
		
		//루비가 콜라 구매
		ruby.buyDrink(cola, vm);
		ruby.showMoney();
        //사파이어가 환타 구매
		sapa.buyDrink(fanta, vm);
		sapa.showMoney();
		//자판기 수익 확인
		vm.showTotalMoney();
		System.out.println("=== 자판기 이용 종료 ===");
		
		

	}

}
