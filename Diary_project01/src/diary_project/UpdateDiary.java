package diary_project;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateDiary {
	
	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void renewDiary() {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 일기 번호: ");
		int serialNum = Integer.parseInt(scan.nextLine());
		
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		if(diaries.isEmpty()) {
			System.out.println("해당 번호의 일기가 없습니다.");
		}else {
			System.out.print("새 제목: ");
			String newTitle = scan.nextLine();
			System.out.print("새 내용: ");
			String newContent = scan.nextLine();
			
			dao.updateDiary(serialNum, newTitle, newContent);
		}
	}

}
