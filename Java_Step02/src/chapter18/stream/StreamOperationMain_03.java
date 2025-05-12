package chapter18.stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationMain_03 {

	public static void main(String[] args) {
		
		//Stream.of() : ��ü�� ��Ʈ������ ��ȯ
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex2"),
				new File("Ex2.bak"), new File("Test.java"));
		
		//������ Ȯ���ڸ� ���� �� �ߺ� �����Ͽ� ���
		stream.map(File::getName) //���� �̸� ������
		    .filter(f -> f.indexOf(".") > -1) //�̸����� Ȯ���ڰ� �ִ� ���ϸ� ����
		    .map(f -> f.substring(f.lastIndexOf(".")+1)) //Ȯ���ڸ� ������
		    .distinct() //�ߺ�����
		    .forEach(System.out::println);//��Ʈ�� ��� ���
		
		System.out.println();
		
		//Arrays.asList(): �迭�� ��Ʈ������ ��ȯ
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");
		
		//�߰���� ����
		Set<String> intermediaResults = new HashSet<>();
		
		//stream ���� 
		List<String> result = list.stream() //stream���� ��ȯ
				.filter(s -> s.startsWith("S")) //s�ڷ� �����ϴ� ���ڿ� ����
				.map(String::toUpperCase) //��� �빮��
				.distinct() //�ߺ�����
				.sorted() //����
				.peek(s -> intermediaResults.add(s)) //�߰���� ����
				.collect(Collectors.toList()); //���ο� ����Ʈ�� ����
		
		System.out.println();
		
		//�߰�������
		System.out.println("intermediaResults Result");
		intermediaResults.forEach((i) -> System.out.println(i+" "));
		System.out.println();
		
		//����������
		System.out.println("result Result");
		result.forEach((i) -> System.out.println(i+" "));
		System.out.println();
		
	}

}
