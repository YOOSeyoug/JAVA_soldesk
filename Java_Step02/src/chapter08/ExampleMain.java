package chapter08;

import java.util.Scanner;

public class ExampleMain extends Example{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//#1
		Example[] calculators = {new CalPlus(), new CalMinus()};
		
		System.out.println("���� A�� �Է��ϼ���: ");
		int a = s.nextInt();
		System.out.println("���� B�� �Է��ϼ���: ");
		int b = s.nextInt();
		
		for(Example ca:calculators) {
			System.out.println(ca.getClass().getSimpleName()+": "+ca.getResult(a, b));
		}
		
		//#2
		//Example e = new CalPlus(); �� �Ͱ� new CalPlus(), �� �� �� ����.
		int plus = calc(new CalPlus(), a, b);
		System.out.println("�� ���� ��: "+plus);
		int minus = calc(new CalMinus(), a, b);
		System.out.println("�� ���� ��: "+minus);
		
		
		//#3 ���� �� ���� �� �ٷ� ���̱�
		System.out.println(calc(new CalPlus(), a, b));
		System.out.println(calc(new CalMinus(), a, b));
		
		
		
		
	}
	
	
	public static int calc(Example c1, int a, int b) {
		
		return c1.getResult(a, b);
	}

}
