package chapter03.switchtest;

import javax.swing.JOptionPane;

public class SwitchCase_02 {

	public static void main(String[] args) {

		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("1~4사이의 번호를 입력하세요."));

		System.out.println("----------Switch-----------");
		switch (num) {
		case 1:
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("출금을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("입금을 선택하셨습니다.");
			break;
		case 4:
			System.out.println("송금을 선택하셨습니다.");
			break;
		default:
			System.out.println("번호를 잘 못 입력 하셨습니다");
		}// switch

		/*
		System.out.println("----------Switch Expression-----------");
		String message = switch (num) {
		case 1 -> "예금조회를 선택하셨습니다.";
		case 2 -> "출금을 선택하셨습니다.";
		case 3 -> "입금을 선택하셨습니다.";
		case 4 -> "송금을 선택하셨습니다.";
		default -> "번호를 잘 못 입력 하셨습니다.";
		};
		System.out.println(message);
		*/

	}// main

}// class
