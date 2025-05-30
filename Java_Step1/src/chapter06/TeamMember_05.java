package chapter06;

public class TeamMember_05 {
	
	//필드=멤버변수
	public String teamName; //팀명
	public String mName; //팀장
	public String mPhone; //팀장 전화번호
	public String sName; //부팀장
	public String name; //팀원명
	public String gender; //팀원 성별
	
	
	//기본 생성자
	public TeamMember_05(){
	}//생성자를 활용해서 초기화를 하면 기본 생성자도 꺼내줘야한다.
	
	//Overload
	public TeamMember_05(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}

	
	//getter / setter
	public String getTeamName() {
		return teamName;
	}
	public String getmName() {
		return mName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public String getsName() {
		return sName;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	

}
