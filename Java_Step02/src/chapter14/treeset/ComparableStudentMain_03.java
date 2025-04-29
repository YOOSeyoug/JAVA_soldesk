package chapter14.treeset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableStudentMain_03 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Alice", 85));
		students.add(new Student("Bob", 85));
		students.add(new Student("Charlie", 80));
		
		//Comparable�� ����� ����
		Collections.sort(students);
		
		System.out.println("�л����� ������ �������� �������� ����");
		for(Student student:students) {
			System.out.println(student);
		}
		

	}

}
