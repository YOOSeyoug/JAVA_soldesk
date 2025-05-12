package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, String>();
	}
	
	//addMember
	public void addMember(Member member) {
		hashMap.put(member.memberId(), member.memberName());
	}
	
	//removeMember
	public boolean removeMember(int memberId) {
		
		while(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId+"�� �������� �ʴ� ���̵��Դϴ�.");
		return false;
	}
	
	//showAllMember
	public void showAllMember() {
		
		Iterator<Integer> ir =hashMap.keySet().iterator(); //�ݺ������� ����ȯ
		
		while(ir.hasNext()) {
			int key = ir.next();
			String member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}
