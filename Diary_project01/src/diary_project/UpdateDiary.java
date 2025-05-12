package diary_project;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateDiary {
	
	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void renewDiary() {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �ϱ� ��ȣ: ");
		int serialNum = Integer.parseInt(scan.nextLine());
		
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		if(diaries.isEmpty()) {
			System.out.println("�ش� ��ȣ�� �ϱⰡ �����ϴ�.");
		}else {
			System.out.print("�� ����: ");
			String newTitle = scan.nextLine();
			System.out.print("�� ����: ");
			String newContent = scan.nextLine();
			
			dao.updateDiary(serialNum, newTitle, newContent);
		}
	}

}
