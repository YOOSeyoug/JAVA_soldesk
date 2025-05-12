package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentScoreMain_01 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> studentSore = new TreeMap<>();
		
		//입력
		studentSore.put("David", 95);
		studentSore.put("Bob", 92);
		studentSore.put("Alice", 85);
		studentSore.put("Charlie", 78);
		System.out.println("=== 학생 성적 출력(이름순 정렬) ===");
		for(Map.Entry<String, Integer> entry : studentSore.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		//특정 학생의 이름으로 조회
		String studentName = "Bob";
		System.out.println("\n"+studentName+"의 성적: "+studentSore.get(studentName));
		
		

	}

}
