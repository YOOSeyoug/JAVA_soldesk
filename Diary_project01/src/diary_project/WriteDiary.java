package diary_project;

import java.sql.Date;
import java.util.Scanner;

public class WriteDiary {
	
	private DiaryDAO dao = DiaryDAO.getdiaryDAO();
	
	public void writeDiary(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		String title = scan.nextLine();
		System.out.print("����: ");
		String content = scan.nextLine();
		
		Diary diary = new Diary();
		diary.setTitle(title);
		diary.setContent(content);
		diary.setDate(java.time.LocalDate.now().toString());
		dao.insertDiary(diary);
	}

}
