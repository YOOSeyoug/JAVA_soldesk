package chapter03.whiletest;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 선택한 서로 다른 3자리 수
		int n1, n2, n3;
		do {
			n1 = (int) (Math.random() * 9) + 1;
			n2 = (int) (Math.random() * 9) + 1;
			n3 = (int) (Math.random() * 9) + 1;
		} while (n1 == n2 || n2 == n3 || n1 == n3);

		int tryCount = 0;

		System.out.println("숫자 야구 게임 시작!(1~9 사이의 서로 다른 숫자 3개)");
		/*
		 * while (true) { tryCount++;
		 * 
		 * System.out.print("입력 (공백으로 구분)"); // 3 7 8 int user1 = scan.nextInt(); int
		 * user2 = scan.nextInt(); int user3 = scan.nextInt();
		 * 
		 * int strike = 0; int ball = 0;
		 * 
		 * // strike=> n1==user1 n2==user2 n3==user3 // ball=> n1==user2 n1==user3 /
		 * n2==user1 n2==user3 /n3==user1 n3==user2
		 * 
		 * if (n1 == user1) { strike++; } else if (n1 == user2 || n1 == user3) { ball++;
		 * }
		 * 
		 * if (n2 == user2) strike++; else if (n2 == user1 || n2 == user3) ball++;
		 * 
		 * if (n3 == user3) { strike++; } else if (n3 == user1 || n3 == user2) { ball++;
		 * }
		 * 
		 * if (strike == 3) { System.out.println("🎉홈럼~~ 승!!");
		 * System.out.println("총 시도 횟수: " + tryCount + "번"); break; } else {
		 * System.out.println("👉" + strike + "스트라이크, " + ball + "볼"); }
		 * 
		 * } // while
		 */

		while (true) {

			tryCount++;

			System.out.print("세 자리 숫자 입력 (공백으로 구분): ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();

			// 예외처리
			if (user1 < 1 || user1 > 9 || user2 < 1 || user2 > 9 || user3 < 1 || user3 > 9 || user1 == user2
					|| user2 == user3 || user1 == user3) {
				System.out.println("잘못된 입력입니다. 1~9 사이의 서로 다른 숫자 3개를 입력하세요");
				continue;
			} // if

			int strike = 0;
			int ball = 0;

			// 스트라이크 판정
			if (user1 == n1)
				strike++;
			if (user2 == n2)
				strike++;
			if (user3 == n3)
				strike++;

			// 볼 판정 (숫자만 맞고 위치가 다른 경우)
			if (user1 == n2 || user1 == n3)
				ball++;
			if (user2 == n1 || user2 == n3)
				ball++;
			if (user3 == n1 || user3 == n2)
				ball++;

			// 출력
			if (strike == 3) {
				System.out.println("🎉 홈~~~~런!! 정답입니다!");
				System.out.println("총 시도 횟수: " + tryCount + "번");
				break;
			} else {
				System.out.println(strike + "S " + ball + "B");
			} // if

		} // while

	}// m

}// c
