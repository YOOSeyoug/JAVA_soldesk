package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_02 {

	public static void main(String[] args) {
		
		//TreeMap ��ü(employeeMap)
		
		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();
		
		//employeeMap�� Employee ��ü 5�� �߰�
		employeeMap.put(101, new Employee("Alice", 30));
		employeeMap.put(102, new Employee("Bob", 25));
		employeeMap.put(103, new Employee("Charlie", 35));
		employeeMap.put(104, new Employee("David", 28));
		
		
		//���
		System.out.println("== �л� ���� ���(�̸��� ����) ==");
		for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID: "+entry.getKey()+"| Name: "+entry.getValue()+"��");
		}
		
		//Ư�� ���� ���� ��ȸ
		int employeeId = 103;
		System.out.println("\n"+employeeId+"���� ���� ����: "+employeeMap.get(employeeId));
		
		
		
		
		
		
	}
	
	
	
	
	
}
