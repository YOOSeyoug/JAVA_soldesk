package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_02 {

	public static void main(String[] args) {
		
		//TreeMap 객체(employeeMap)
		
		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();
		
		//employeeMap에 Employee 객체 5명 추가
		employeeMap.put(101, new Employee("Alice", 30));
		employeeMap.put(102, new Employee("Bob", 25));
		employeeMap.put(103, new Employee("Charlie", 35));
		employeeMap.put(104, new Employee("David", 28));
		
		
		//출력
		System.out.println("== 학생 성적 출력(이름순 정렬) ==");
		for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID: "+entry.getKey()+"| Name: "+entry.getValue()+"점");
		}
		
		//특정 직원 정보 조회
		int employeeId = 103;
		System.out.println("\n"+employeeId+"님의 직원 정보: "+employeeMap.get(employeeId));
		
		
		
		
		
		
	}
	
	
	
	
	
}
