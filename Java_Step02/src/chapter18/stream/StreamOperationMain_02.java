package chapter18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationMain_02 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Sophia","Emma","Olivia","Isabella","Mia");
		
		Stream<String> stream = list.stream();
		//�߰����� sorted() ���� �� �������� forEach()
		stream.sorted().forEach(System.out::println);
		
		//���� �߻� : �ѹ� ����� stream�� ���� �� �̹� �Ҹ�
		//stream.filter(s -> s.contains("m")).forEach(System.out::println);
		System.out.println();
		System.out.println("m or M�� �� �̸� ���");
		list.stream().filter(s -> s.toUpperCase().contains("M")).forEach(System.out::println);
		
		System.out.println();
		System.out.println("�̸� ���̰� 5�� �̻��� �̸� ���");
		list.stream().filter(s -> s.length() >=5).forEach(System.out::println);
		
		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };
		
		//�������� ���� �� ���
		System.out.println("�������� ���� �� ���");
		Arrays.stream(arr).sorted().forEach((i) -> System.out.println(i+"\t"));
		System.out.println();
		
		//¦�� ���
		System.out.println("¦�� ���");
		Arrays.stream(arr).filter(i -> i%2==0).forEach((i) -> System.out.print(i + " "));
		
		//¦�� ���
		System.out.println();
		System.out.println("2�� ����� �ƴϰ�, 3�� ����� �ƴ� ���� ���");
		Arrays.stream(arr).filter(i -> i % 2 !=0 && i % 3 != 0).forEach((i) -> System.out.print(i + " "));

	}

}
