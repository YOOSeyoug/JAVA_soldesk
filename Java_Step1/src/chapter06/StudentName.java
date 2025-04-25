package chapter06;

public class StudentName {

	public static void main(String[] args) {
		
		//기본 생성자를 이용한 student1 객체
		Student_07 student1=new Student_07();
		
		student1.studentName="철수";
		student1.address="부산";
		student1.showStudentInfo();
		
		//생성자를 이용한 초기화
		System.out.println();
		Student_07 student2=new Student_07("영희", "종로구");
		student2.showStudentInfo();
		
		//getter / setter
		Student_07 student3=new Student_07();
		student3.setStudentName("솔데스크");
		student3.setAddress("강서구");
		student3.showStudentInfo();
		
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
		

	}

}
