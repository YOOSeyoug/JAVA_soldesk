package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		 * (월요일:떡볶이,화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */

		String str = JOptionPane.showInputDialog("요일을 입력하세요");
		String cooking;

		switch (str) {
		case "월요일":
			cooking = "쌀밥";
			break;
		case "화요일":
			cooking = "보리밥";
			break;
		case "수요일":
			cooking = "잡곡밥";
			break;
		case "목요일":
			cooking = "현미밥";
			break;
		case "금요일":
			cooking = "전복밥";
			break;
		case "토요일":
			cooking = "송이밥";
			break;
		case "일요일":
			cooking = "녹차밥";
			break;
		default:
			cooking = "잘 못 입력 하셨습니다.";
		}

		JOptionPane.showMessageDialog(null, cooking + "이 준비 되었습니다.");

	}// m
}// c
