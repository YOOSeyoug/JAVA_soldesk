package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("신희우");
		list.add("최대호");
		list.add("박현규");
		list.add("윤준영");
		list.add("유세영");
		
		System.out.println("오버플로우 팀원: " + list);
		System.out.println("------------------------");
		
		//반복자
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String v = it.next();
			System.out.print(v + " ");
		}
		
		
		
		
		

	}

}
