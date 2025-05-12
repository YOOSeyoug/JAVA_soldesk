package chapter18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationMain_05 {

	public static void main(String[] args) {
		
		Student[] stuArr = { new Student(1, "ȫ�浿", 85), new Student(2, "�̹���", 77), new Student(3, "��ȫ��", 84),
				new Student(4, "�ֹ�ȣ", 56), new Student(5, "�����", 66), new Student(6, "������", 79) };
		
		//Stream<Student> stream = Stream.of(stuArr).flatMap(Arrays::stream);
		
		//�л� �̸��� ���� �� ����Ʈ�� ����
		List<String> names = Stream.of(stuArr) //��Ʈ������ ��ȯ
				.map(Student::getName) //�̸��� ����
				.collect(Collectors.toList()); //���� ����Ʈ�� ��ȯ
		System.out.println(names);
		
		//���� ������ ��������
		List<Integer> engScore = Stream.of(stuArr)
				.map(Student::getEng)
				.collect(Collectors.toList());
		System.out.println(engScore);
		
		//���� ������ 70�� �̻��� �л��� �̸��� ��������
		List<String> names2 = Stream.of(stuArr) //��Ʈ������ ��ȯ
				.filter(s -> s.getEng() >= 70) //�������� 70�� �̻��� �л�
				.map(Student::getName) //�̸��� ����
				.collect(Collectors.toList()); //���� ����Ʈ�� ��ȯ
		System.out.println(names2);

	}

}
