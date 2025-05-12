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
			System.out.println("1. �޴� �߰� | 2. �޴� ��ȸ | 3. ����");
			System.out.println("==================================");
			int menuNum = scan.nextInt();
			scan.nextLine();
			
			switch (menuNum) {
			case 1: {
				System.out.println("- ���ķ� �޴��� �߰��մϴ�. -");
				System.out.println("���ķ� �޴� �̸��� �Է��ϼ���.");
				String fruitName = scan.nextLine();
				System.out.println(fruitName + "�� ������ �Է��ϼ���");
				int price = Integer.parseInt(scan.nextLine());
				
				mt.menuList.add(new Tanghulu(fruitName, price));
				System.out.println(fruitName + "�޴��� ���������� �߰��Ǿ����ϴ�.");
				break;
			}
			
			case 2: {
				for(int i=0; i<mt.menuList.size(); i++) {
					System.out.println((i+1) + ". " + mt.menuList.get(i));
				}
				break;
			}
			
			case 3: {
				System.out.println("�޴� ������ �����մϴ�. ���� ȭ������ ���ư��ϴ�.");
				run = false;
				break;
			}
			
			default:
				System.out.println("���� �޴� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
			
			
	  }
	
		
	}

}
