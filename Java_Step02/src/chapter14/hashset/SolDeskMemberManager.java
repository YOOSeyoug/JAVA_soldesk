package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class SolDeskMemberManager {
	
	//HashSet 공가을 이용해서 멤버정보를 관리
	private Set<SolDeskMember> members;
	
	//생성자를 통해서 객체의 메모리 확보
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMember>();
	}
	
	//회원 추가 메서드(중복 허용 안함)
	public void addMember(SolDeskMember member) {
		if(members.add(member)) {
			System.out.println(member.getMemberId()+"님 회원 가입 완료");
		}else {
			System.out.println(member.getMemberId()+"는(은) 이미 존재하는 ID입니다.");
		}
	}//addMember
	
	public void showAllMember() {
		
		for(SolDeskMember member : members);
		System.out.println(members);
		
	}//showAllMember
	
	

}
