package chapter15.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDifference_03 {

	public static void main(String[] args) {
		
		//HashMap ��ü ���� �� ������ �߰�
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("apple", "red");
		hashMap.put("banana", "yellow");
		hashMap.put("grape", "purple");
		hashMap.put("orange", "orange");
		
		//HashMap �����(���� ������� ����. ���� ������)
		System.out.println("===HashMap ���(���� ������)===");
		for(Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}//for
		
		
		//HashMap ��ü ���� �� ������ �߰�
		Map<String, String> linkedhashMap = new LinkedHashMap<>();
				
		linkedhashMap.put("apple", "red");
		linkedhashMap.put("banana", "yellow");
		linkedhashMap.put("grape", "purple");
		linkedhashMap.put("orange", "orange");
				
		//linkedhashMap �����(������ �����)
		System.out.println("===linkedhashMap ���===");
		for(Map.Entry<String, String> entry : linkedhashMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}//for
		
		

	}

}
