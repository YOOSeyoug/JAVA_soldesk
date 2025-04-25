package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr = scan.nextInt();

			// if -> 60점 이상이면 합격 그밖에 불합격
			// 0이하 또는 100초과시 "0~100까지의 점수만 입력 가능합니다."
			// OR -> ||

			if (scr < 0 || scr > 100) {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
				break;
			} else if (scr >= 60) {
				System.out.println("합격");
				break;
			} else {
				System.out.println("불합격");
				break;
			} // if

		} // while
		System.out.println("프로그램 종료");
	}
}
