package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// 전역변수
		boolean run = true;
		int save = 0;
		int money;

		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int num = scan.nextInt();

			// 선택한 값으로 은행업무 수행
			if (num == 1) {
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("잔액: " + save);
				System.out.print("입금할 금액을 입력하세요: ");
				money = scan.nextInt();
				if (money <= 0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				} else {
					save += money;
				}
			} else if (num == 2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("잔액: " + save);
				System.out.print("출금할 금액을 입력하세요: ");
				money = scan.nextInt();
				save -= money; // 선출금
				if (save < 0) {
					System.out.println("잔액이 부족합니다.");
					save += money;
				}
			} else if (num == 3) {
				System.out.println("잔액을 선택하셨습니다.");
				System.out.println("잔액: " + save);
			} else if (num == 4) {
				System.out.println("종료를 선택하셨습니다.");
				run = false;
			} else {
				System.out.println("잘못된 서비스를 선택하셨습니다.");
			} // if

		} // while
		System.out.println("프로그램 종료");
	}

}
