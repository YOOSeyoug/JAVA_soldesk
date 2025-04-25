package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num, sum = 0, cnt = 0;
		double avg;

		while (true) {
			System.out.print("숫자를 입력하세요(0 입력시 프로그램 종료): ");
			num = scan.nextInt();

			if (num == 0) {
				break;
			}

			cnt++;
			sum += num; // sum=sum+num
		} // w

		avg = (double) sum / cnt;

		System.out.println("입력된 숫자의 갯수: " + cnt);
		System.out.println("입력된 숫자의 합계: " + sum);
		System.out.printf("입력된 숫자의 평균: %.3f", avg);

	}// m

}
