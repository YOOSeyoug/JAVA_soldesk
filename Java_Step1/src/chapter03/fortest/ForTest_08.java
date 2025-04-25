package chapter03.fortest;

public class ForTest_08 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.print("[" + i + "단]" + "\t");
		} // for
		System.out.println();

		// ---------------------------------------
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			} // in for
			System.out.println();
		} // out for

	}// m
}// c
