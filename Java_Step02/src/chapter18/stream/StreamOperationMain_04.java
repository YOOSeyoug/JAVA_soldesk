package chapter18.stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationMain_04 {

	public static void main(String[] args) {
		
		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };
		
		System.out.println("�⺻�� ��Ʈ�� ��� �޼���");
		System.out.println("�迭�� ��: "+Arrays.stream(arr).sum());
		System.out.println("�迭�� ���: "+Arrays.stream(arr).average());
		System.out.println("�迭�� �ִ밪: "+Arrays.stream(arr).max());
		System.out.println("�迭�� �ּҰ�: "+Arrays.stream(arr).min());
		System.out.println("�迭�� ��� ����: "+Arrays.stream(arr).count());
		
	}

}
