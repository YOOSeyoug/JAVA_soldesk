package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentScoreMain_01 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> studentSore = new TreeMap<>();
		
		//�Է�
		studentSore.put("David", 95);
		studentSore.put("Bob", 92);
		studentSore.put("Alice", 85);
		studentSore.put("Charlie", 78);
		System.out.println("=== �л� ���� ���(�̸��� ����) ===");
		for(Map.Entry<String, Integer> entry : studentSore.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		//Ư�� �л��� �̸����� ��ȸ
		String studentName = "Bob";
		System.out.println("\n"+studentName+"�� ����: "+studentSore.get(studentName));
		
		

	}

}
