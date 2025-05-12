package chapter18.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain_01 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ABC", "BCD", "CDE", "D", "E");
		
		//���̰� 3�̻��� �̸��� �빮�ڷ� �ٲٰ� �����Ͽ� ���
		names.stream()
		     .filter(name -> name.length() >= 3)
		     .map(String::toUpperCase)
		     .sorted()
		     .forEach(System.out::println);
		

	}

}
