package chapter03;

import javax.swing.JOptionPane;

public class IfTest_06 {

	public static void main(String[] args) {
		// 두수를 입력받아 어떤 수가 큰지 판단하는 프로그램
		// num1, num2 의 수가 num1이 큽니다. 또는 num2가 큽니다. 또는 같습니다의 결과가 나오도록 구현
		// 그외값은 다시 입력하세요 로 출력
		
		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		if(num1 > num2) {
			System.out.println("num1이 큽니다.");
		}else if(num1 < num2) {
			System.out.println("num2가 큽니다.");	
		}else if(num1 == num2){
			System.out.println("num1과 num2가 같습니다.");	
		}else {
			System.out.println("다시 입력해 주세요");	
		}
	}

}
