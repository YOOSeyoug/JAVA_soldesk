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
			System.out.println("1. �ϱ� �ۼ� | 2. �ϱ� ��ȸ | 3. �ϱ� ���� | 4. �ϱ� ���� | 5. ����");
			System.out.println("-----------------------------------------------------------");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
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
				System.out.println("���̾�� �����մϴ�.");
				run = false;
			}
			
			default:
				System.out.println("���� �޴� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
		

	}

}
