package chapter15.treemap;

//record: 생성자 오버로딩, getter, setter

public class Employee {

	String name;
	int age;
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		
		return name + ": " + age;
	}

	
	
	
	
	

}
