package chapter15.hashmap;

public class MemberHashMapMain_06 {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "�̼���"));
		memberHashMap.addMember(new Member(1002, "������"));
		memberHashMap.addMember(new Member(1003, "�����"));
		
		Member memeberJung = new Member(1004, "���ϳ�");
		memberHashMap.addMember(memeberJung);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		//�ߺ��� �ȵ�
		memberHashMap.addMember(new Member(1003, "�����"));
		memberHashMap.showAllMember();

	}

}
