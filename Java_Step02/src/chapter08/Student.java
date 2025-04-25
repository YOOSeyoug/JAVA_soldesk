package chapter08;

public class Student extends People{
	
	public int studentNo;

	//오버로딩 되어있음. 부모 클래스, 자신 것 차례로 초기화
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //오버로딩된 부모클래스의 생성자를 호출하여 초기화함
		this.studentNo = studentNo;
	}
	

	
	
	
}
