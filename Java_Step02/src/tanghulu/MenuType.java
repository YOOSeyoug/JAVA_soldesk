package tanghulu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuType {
	
	public ArrayList<Tanghulu> menuList = new ArrayList<>();
	
	public void masterMenu() {
		if(menuList.isEmpty()) {
			menuList.add(new Tanghulu ("귤 탕후루", 1000));
			menuList.add(new Tanghulu ("바나나 탕후루", 1200));
			menuList.add(new Tanghulu ("딸기 탕후루", 1200));
			menuList.add(new Tanghulu ("파인애플 탕후루", 1300));
			menuList.add(new Tanghulu ("용과 탕후루", 1500));			
		}
	}
	
	public void menuLoop(Sales sales) {
		masterMenu();
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------");
			for(int i=0; i < menuList.size(); i++) {
				System.out.print(i+1 + "."+menuList.get(i) + " | ");
			}
			System.out.println(menuList.size()+1+ "." + "종료");
			System.out.println("----------------------------------------------------------------------------------");
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			if(num>=1 && num<=menuList.size()) {
				Tanghulu selectedMenu = menuList.get(num-1);
				System.out.println(selectedMenu + " 몇 개를 구매하시겠습니까?");
				int quantity = scan.nextInt();
				sales.addSales(quantity);
			}else if(num == menuList.size()+1){
				int sum = 0;
				for(Tanghulu t : menuList) {
					sum += t.getPrice();
				}
				System.out.println("구매하신 탕후루의 총 가격은 " + sum + "원 입니다.");
				run = false;
			}else {
				System.out.println("메뉴 번호를 잘못 입력하셨습니다. 이전 화면으로 돌아갑니다");
			}
			
		}
		
	}

}
