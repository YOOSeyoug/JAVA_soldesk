package chapter18.lambda;

@FunctionalInterface
interface Myfunction{
	
	public int square(int x);
}

public class Quiz {

	public static void main(String[] args) {

		Myfunction f = (x) -> x*x;
		System.out.println("12�� ����: "+f.square(12));

	}

}
