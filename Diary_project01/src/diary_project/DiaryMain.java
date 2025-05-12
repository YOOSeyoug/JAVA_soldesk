package diary_project;

import java.util.Scanner;

public class DiaryMain {

	public static void main(String[] args) {
		
		DiaryDAO dao = DiaryDAO.getdiaryDAO();
		Diary diary = new Diary();
		
		Scanner scan = new Scanner(System.in);
		
		int diaryNum;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 일기 작성 | 2. 일기 조회 | 3. 일기 수정 | 4. 일기 삭제 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("메뉴 번호를 입력하세요: ");
			diaryNum = Integer.parseInt(scan.nextLine());
			
			switch (diaryNum) {
			case 1: {
				WriteDiary write = new WriteDiary();
				write.writeDiary();
				break;
			}
			
			case 2: {
				ReadDiary read = new ReadDiary();
				read.readDiary();
				break;
			}
			
			case 3: {
				UpdateDiary update = new UpdateDiary();
				update.renewDiary();
				break;
			}
			
			case 4: {
				DeleteDiary delete = new DeleteDiary();
				delete.removeDiary();
				break;
			}
			
			case 5: {
				System.out.println("다이어리를 종료합니다.");
				run = false;
			}
			
			default:
				System.out.println("없는 메뉴 번호입니다. 다시 입력해주세요.");
				break;
			}
		}
		

	}

}
