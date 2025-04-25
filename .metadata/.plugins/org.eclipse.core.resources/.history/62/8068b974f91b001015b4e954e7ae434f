package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr = scan.nextInt();

			// if -> 60점 이상이고 100점 이하면 합격
			// 0이상이고 60점 미만이면 불합격
			// 그밖에 "0~100까지의 점수만 입력 가능합니다."
			// AND -> &&

			if (scr >= 60 && scr <= 100) {
				System.out.println("합격");
				break;
			} else if (scr > 0 && scr < 60) {
				System.out.println("불합격");
				break;
			} else {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
				break;
			} // if

		} // while
		System.out.println("프로그램 종료");
	}
}
