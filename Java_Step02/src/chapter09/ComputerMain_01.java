package chapter09;

public class ComputerMain_01 {

	public static void main(String[] args) {
		
		//�߻�Ŭ������ ��ü�� ���� �� ����
		//Computer c1 = new DeskTop();
		//Computer c2 = new MyNoteBook();
		
		Computer c3 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c3.typing(); //DeskTop
		c3.display(); //DeskTop
		c4.display(); //NoteBook
		c4.typing(); //MyNoteBook
		
		

	}

}
