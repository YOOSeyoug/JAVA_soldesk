package diary_project;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteDiary {
	
	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void removeDiary(){
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 일기 번호: ");
		int serialNum = Integer.parseInt(scan.nextLine());
		
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		if(diaries.isEmpty()) {
			System.out.println("해당 번호의 일기가 없습니다.");
		}else {
			dao.deleteDiary(serialNum);
		}
		
		
	}

}
