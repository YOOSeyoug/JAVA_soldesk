package diary_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadDiary {

	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void readDiary() {
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȸ�� �ϱ� ��ȣ: ");
		int serialNum = Integer.parseInt(scan.nextLine());
		
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		if(diaries.isEmpty()) {
			System.out.println("�ش� ��ȣ�� �ϱⰡ �����ϴ�.");
		}else {
			for(Diary d : diaries) {
				System.out.println("[" + d.getTitle() + "]");
				System.out.println(d.getContent());
				System.out.println("�ۼ���: " + d.getDate());
			}
		}
		
	}
}
