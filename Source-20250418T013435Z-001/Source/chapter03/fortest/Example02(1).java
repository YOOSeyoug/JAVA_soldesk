package chapter03.fortest;

public class Example02 {

	public static void main(String[] args) {
		// 홀수 구구단을 만드세요

		for (int i = 1; i <= 9; i += 2) {

			System.out.println(i + "단");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			} // in for
			System.out.println();

		} // out for

	}

}
