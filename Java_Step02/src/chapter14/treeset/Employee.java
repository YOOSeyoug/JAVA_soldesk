package chapter14.treeset;

//record: ������ �����ε�, getter, setter

public record Employee(String name, int age) {

	@Override
	public String toString() {
		
		return name + ": " + age;
	}

	
	
	
	
	

}
