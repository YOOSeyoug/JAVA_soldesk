package chapter16;

import java.util.Scanner;

public class ThrowsMain_04 {

	//���ڿ��� ���ڷ� �ٲپ ������ ���
	public void gugudan(String str) {
		int num = Integer.parseInt(str);
		for (int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	//�Է��� ������ ù��° �ڸ��� �߶󳻱�
	public void getNumber(String str) throws Exception {
		String s = str.substring(0, 1);
		gugudan(s);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ThrowsMain_04 te = new ThrowsMain_04();
		
		System.out.print("������ ���� �Է�> ");
		String s = scan.next();
		
		try {
			te.getNumber(s);
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		System.out.println("Program end.");
		
		
	}

}
