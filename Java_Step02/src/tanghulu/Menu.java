package tanghulu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Sales s = new Sales();
		MenuType mt = new MenuType();
		MenuPlus mp = new MenuPlus(mt);
		
		int menuNum;
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 구매 | 2. 매출량 확인 | 3. 메뉴 변경 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.println();
			
			Scanner scan = new Scanner(System.in);
			menuNum = scan.nextInt();
			
			switch (menuNum) {
			case 1: {
				mt.menuLoop(s);
				break;
			}
			
			case 2: {
				System.out.println("현재 매출량은 "+s.getTotalSales()+"개 입니다.");
				break;
			}
			
			case 3: {
				mp.menuPlus();
				break;
			}
			
			case 4: {
				System.out.println("프로그램 종료를 선택하셨습니다. 프로그램을 종료합니다.");
				run = false;
				break;
			}
			
			default:
				System.out.println("없는 메뉴 번호입니다. 다시 선택해주세요.");
				break;
			}
		}
		

	}

}
