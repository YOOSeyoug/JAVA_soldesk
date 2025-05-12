package tanghulu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuType {
	
	public ArrayList<Tanghulu> menuList = new ArrayList<>();
	
	public void masterMenu() {
		if(menuList.isEmpty()) {
			menuList.add(new Tanghulu ("�� ���ķ�", 1000));
			menuList.add(new Tanghulu ("�ٳ��� ���ķ�", 1200));
			menuList.add(new Tanghulu ("���� ���ķ�", 1200));
			menuList.add(new Tanghulu ("���ξ��� ���ķ�", 1300));
			menuList.add(new Tanghulu ("��� ���ķ�", 1500));			
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
			System.out.println(menuList.size()+1+ "." + "����");
			System.out.println("----------------------------------------------------------------------------------");
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			if(num>=1 && num<=menuList.size()) {
				Tanghulu selectedMenu = menuList.get(num-1);
				System.out.println(selectedMenu + " �� ���� �����Ͻðڽ��ϱ�?");
				int quantity = scan.nextInt();
				sales.addSales(quantity);
			}else if(num == menuList.size()+1){
				int sum = 0;
				for(Tanghulu t : menuList) {
					sum += t.getPrice();
				}
				System.out.println("�����Ͻ� ���ķ��� �� ������ " + sum + "�� �Դϴ�.");
				run = false;
			}else {
				System.out.println("�޴� ��ȣ�� �߸� �Է��ϼ̽��ϴ�. ���� ȭ������ ���ư��ϴ�");
			}
			
		}
		
	}

}
