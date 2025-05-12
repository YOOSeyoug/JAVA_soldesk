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
			System.out.println("1. ���� | 2. ���ⷮ Ȯ�� | 3. �޴� ���� | 4. ����");
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
				System.out.println("���� ���ⷮ�� "+s.getTotalSales()+"�� �Դϴ�.");
				break;
			}
			
			case 3: {
				mp.menuPlus();
				break;
			}
			
			case 4: {
				System.out.println("���α׷� ���Ḧ �����ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				run = false;
				break;
			}
			
			default:
				System.out.println("���� �޴� ��ȣ�Դϴ�. �ٽ� �������ּ���.");
				break;
			}
		}
		

	}

}
