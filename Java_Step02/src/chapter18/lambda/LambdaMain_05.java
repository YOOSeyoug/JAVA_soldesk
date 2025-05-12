package chapter18.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaMain_05 {

	public static void main(String[] args) {
		
		//�� ���� ���ڸ� �޾Ƽ� �� ����
		BiFunction<Integer,Integer, Integer> f1 = (x,y) -> x+y;
		System.out.println("15�� 24�� ����: "+f1.apply(15, 24));
		
		//�� ���� String�� �޾Ƽ� �ϳ��� ���ڿ��� ���Ͽ� ����
		BiFunction<String, String, String> f2 = (s1,s2) -> s1.concat(s2);
		System.out.println(f2.apply("����", "��"));
		
		//�� ���� ���ڸ� �޾Ƽ� ū �� ���
		BiConsumer<Integer, Integer> c1 = (x,y) -> System.out.println(x>y ? x : y);
		System.out.print("10�� 9 �� ū �� ���: ");
		c1.accept(10, 9);
		
		//����(�Ű����� ��)�� ���� ���ڿ��� ���ڰ� ������ ũ������ �Ǻ�
		BiPredicate<String, Integer> p1 = (x,y) -> x.length() == y;
		System.out.println("apple�� 5���̴�: "+p1.test("aplle", 5));
		System.out.println("pineapple�� 5���̴�: "+p1.test("pineapple", 5));
		
		
	}

}
