package chapter15.hashmap;


public record Member(int memberId, String memberName) {

	@Override
	public String toString() {
		
		return "Memeber [memberId ="+memberId+", memeberName="+memberName+"]";
	}
	
	

}
