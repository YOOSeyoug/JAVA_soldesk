package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size : " + list.size());
		
		list.add(100);
		list.add(50);
		System.out.println("list.size : " + list.size());
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------Iterator----------");
		//list.iterator() : 일반데이터를 반복구조로 형변환
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			it.next();//자동 unBoxing
		}
		
		
	}

}
