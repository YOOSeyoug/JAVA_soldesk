package chapter03.fortest;

import java.util.Scanner;

public class ForTest_03 {

	public static void main(String[] args) {

		// 조건:합계가 입력받은 수를 초과하면 반복문을 멈춤

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();// 10
		int i, sum = 0;

		for (i = 1;; i++) {
			if (sum > num) {
				break;
			} // if
			sum += i;
			System.out.print(i + " ");
		} // for
		System.out.println();
		System.out.println("1~" + (i - 1) + "까지의 총합: " + sum);

	}

}
