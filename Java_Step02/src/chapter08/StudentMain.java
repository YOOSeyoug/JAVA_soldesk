package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		Student std = new Student("유세영", "010-1234-5678", 1010);
		System.out.println("이름: "+std.name);
		System.out.println("번호: "+std.ssn);
		System.out.println("학번: "+std.studentNo);

	}

}
