package chapter03.fortest;

public class ForTest_06 {

	public static void main(String[] args) {
		// 1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("3의 배수의 합 : " + sum);

	}// m
}// c
