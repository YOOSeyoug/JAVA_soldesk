package tanghulu;

import java.util.Scanner;

public class MenuPlus {
	
	private MenuType mt;
	
	public MenuPlus(MenuType mt) {
		this.mt = mt;
	}
	
	public void menuPlus(){
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("==================================");
			System.out.println("1. 메뉴 추가 | 2. 메뉴 조회 | 3. 종료");
			System.out.println("==================================");
			int menuNum = scan.nextInt();
			scan.nextLine();
			
			switch (menuNum) {
			case 1: {
				System.out.println("- 탕후루 메뉴를 추가합니다. -");
				System.out.println("탕후루 메뉴 이름을 입력하세요.");
				String fruitName = scan.nextLine();
				System.out.println(fruitName + "의 가격을 입력하세요");
				int price = Integer.parseInt(scan.nextLine());
				
				mt.menuList.add(new Tanghulu(fruitName, price));
				System.out.println(fruitName + "메뉴가 정상적으로 추가되었습니다.");
				break;
			}
			
			case 2: {
				for(int i=0; i<mt.menuList.size(); i++) {
					System.out.println((i+1) + ". " + mt.menuList.get(i));
				}
				break;
			}
			
			case 3: {
				System.out.println("메뉴 변경을 종료합니다. 이전 화면으로 돌아갑니다.");
				run = false;
				break;
			}
			
			default:
				System.out.println("없는 메뉴 번호입니다. 다시 입력해주세요.");
			}
			
			
	  }
	
		
	}

}
