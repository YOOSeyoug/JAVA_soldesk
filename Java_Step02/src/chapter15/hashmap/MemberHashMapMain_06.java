package chapter15.hashmap;

public class MemberHashMapMain_06 {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1001, "이수정"));
		memberHashMap.addMember(new Member(1002, "박진영"));
		memberHashMap.addMember(new Member(1003, "김우진"));
		
		Member memeberJung = new Member(1004, "정하나");
		memberHashMap.addMember(memeberJung);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		//중복이 안됨
		memberHashMap.addMember(new Member(1003, "김우진"));
		memberHashMap.showAllMember();

	}

}
