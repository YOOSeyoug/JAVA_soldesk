package chapter07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class StudentMain {

	public static void main(String[] args) {
		
		//studentLee에 이수정으로 설정 후 serialNum과 StudentName 출력
		
		Student_03 studentLee = new Student_03();
		studentLee.setStudentName("이수정");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentID);
		//studentLee.serialNum++;
		/*
		studentLee.StudentName = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println(studentLee.StudentName+"님의 학번은 "+studentLee.serialNum+"입니다.");
		*/
		
		System.out.println();
		Student_03 studentKim = new Student_03();
		studentKim.setStudentName("김우성");
		System.out.println(studentKim.StudentName);
		System.out.println(studentKim.serialNum);
		System.out.println(studentKim.studentID);
		//studentKim.serialNum++;
		
		System.out.println();
		Student_03 studentPark = new Student_03();
		studentPark.setStudentName("박정우");
		System.out.println(studentPark.StudentName);
		System.out.println(studentPark.serialNum);
		System.out.println(studentPark.studentID);

	}

}
