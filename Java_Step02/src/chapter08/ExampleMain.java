package chapter08;

import java.util.Scanner;

public class ExampleMain extends Example{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//#1
		Example[] calculators = {new CalPlus(), new CalMinus()};
		
		System.out.println("정수 A를 입력하세요: ");
		int a = s.nextInt();
		System.out.println("정수 B를 입력하세요: ");
		int b = s.nextInt();
		
		for(Example ca:calculators) {
			System.out.println(ca.getClass().getSimpleName()+": "+ca.getResult(a, b));
		}
		
		//#2
		//Example e = new CalPlus(); 한 것과 new CalPlus(), 한 것 과 같다.
		int plus = calc(new CalPlus(), a, b);
		System.out.println("두 수의 합: "+plus);
		int minus = calc(new CalMinus(), a, b);
		System.out.println("두 수의 차: "+minus);
		
		
		//#3 위의 네 줄을 두 줄로 줄이기
		System.out.println(calc(new CalPlus(), a, b));
		System.out.println(calc(new CalMinus(), a, b));
		
		
		
		
	}
	
	
	public static int calc(Example c1, int a, int b) {
		
		return c1.getResult(a, b);
	}

}
