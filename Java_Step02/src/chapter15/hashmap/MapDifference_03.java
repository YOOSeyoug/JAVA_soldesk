package chapter15.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDifference_03 {

	public static void main(String[] args) {
		
		//HashMap 객체 생성 및 데이터 추가
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("apple", "red");
		hashMap.put("banana", "yellow");
		hashMap.put("grape", "purple");
		hashMap.put("orange", "orange");
		
		//HashMap 출력은(순서 보장되지 않음. 순서 무작위)
		System.out.println("===HashMap 출력(순서 무작위)===");
		for(Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}//for
		
		
		//HashMap 객체 생성 및 데이터 추가
		Map<String, String> linkedhashMap = new LinkedHashMap<>();
				
		linkedhashMap.put("apple", "red");
		linkedhashMap.put("banana", "yellow");
		linkedhashMap.put("grape", "purple");
		linkedhashMap.put("orange", "orange");
				
		//linkedhashMap 출력은(순서가 보장됨)
		System.out.println("===linkedhashMap 출력===");
		for(Map.Entry<String, String> entry : linkedhashMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}//for
		
		

	}

}
