package diary_project;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteDiary {
	
	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void removeDiary(){
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �ϱ� ��ȣ: ");
		int serialNum = Integer.parseInt(scan.nextLine());
		
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		if(diaries.isEmpty()) {
			System.out.println("�ش� ��ȣ�� �ϱⰡ �����ϴ�.");
		}else {
			dao.deleteDiary(serialNum);
		}
		
		
	}

}
