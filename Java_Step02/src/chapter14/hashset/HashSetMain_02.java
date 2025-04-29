package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain_02 {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		
		//요소 추가
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		
		//중복이 허용되지 않음
		hashSet.add("Orange");
		
		System.out.println("HashSet: "+hashSet);
		
		if(hashSet.contains("Banana")) {
			System.out.println("Banana is in the HashSet");
		}
		
		//요소 삭제
		hashSet.remove("Orange");
		System.out.println("HashSet: "+hashSet);
		
		

	}

}
