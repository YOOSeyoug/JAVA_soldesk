package chapter18.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain_01 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ABC", "BCD", "CDE", "D", "E");
		
		//길이가 3이상인 이름을 대문자로 바꾸고 정렬하여 출력
		names.stream()
		     .filter(name -> name.length() >= 3)
		     .map(String::toUpperCase)
		     .sorted()
		     .forEach(System.out::println);
		

	}

}
