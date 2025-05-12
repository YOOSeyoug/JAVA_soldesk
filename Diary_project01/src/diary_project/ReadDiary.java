package diary_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadDiary {

	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void readDiary() {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 일기 번호: ");
		int serialNum = Integer.parseInt(scan.nextLine());
		
		ArrayList<Diary> diaries = new ArrayList<Diary>();
		if(diaries.isEmpty()) {
			System.out.println("해당 번호의 일기가 없습니다.");
		}else {
			for(Diary d : diaries) {
				System.out.println("[" + d.getTitle() + "]");
				System.out.println(d.getContent());
				System.out.println("작성일: " + d.getDate());
			}
		}
		
	}
}
