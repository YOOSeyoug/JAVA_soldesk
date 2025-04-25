package chapter03.whiletest;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// 숫자 암호(3자리) 해제
		/*
		 * 1.컴퓨터가 100~999 사이의 무작위 암호를 설정 2.사용자가 맞출 때까지 입력 3.틀릴 경우 "틀렸습니다. 다시 입력하세요." 출력
		 * 4.맞추면 "성공! 암호 해제 완료" 5.몇 번 만에 맞췄는지 count 출력
		 */

		Scanner scan = new Scanner(System.in);
		int password = (int) (Math.random() * 900) + 100;// PC
		int userinput;
		int count = 0;

		System.out.println("암호 해제 게임->3자리 숫자를 맞춰보세요");

		do {
			System.out.print("암호 입력: ");
			userinput = scan.nextInt();
			count++;

			if (userinput < password) {
				System.out.println("더 큰 수를 입력하세요 ");
			} else if (userinput > password) {
				System.out.println("더 작은 수를 입력하세요 ");
			} // if

		} while (password != userinput);

		System.out.println("성공! 암호 해제 완료 (시도 횟수: " + count + "번)");

	}

}
