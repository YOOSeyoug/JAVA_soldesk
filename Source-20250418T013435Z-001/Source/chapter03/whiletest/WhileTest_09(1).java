package chapter03.whiletest;

import javax.swing.JOptionPane;

public class WhileTest_09 {

	public static void main(String[] args) {

		int num1;
		int num2;

		do {

			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));

			if (num1 == num2) {
				System.out.println("인증성공!");
			} else {
				System.out.println("다시 입력하세요");
			}

		} while (num1 != num2);

	}// main

}
