package New_Test;

public class AnimalInfo {
	
	public String type;
	int age;
	String habitat;
	
	public AnimalInfo() {
		
	}
	
	public AnimalInfo(String type) {
		this.type=type;
	}
	
	public AnimalInfo(String type, int age) {
		this.type=type;
		this.age=age;
	}
	
	public AnimalInfo(String type, int age, String habitat) {
		this.type=type;
		this.age=age;
		this.habitat=habitat;
	}
	
	public void printInfo() {
		System.out.print("종류: "+type);
		if (age>0) System.out.print(", 나이: "+age);
		if (habitat!=null) System.out.println(", 서식지: "+habitat);
		System.out.println();

	}
	
	public static void main(String[] args) {
		AnimalInfo p1=new AnimalInfo("토끼");
		AnimalInfo p2=new AnimalInfo("사자", 5);
		AnimalInfo p3=new AnimalInfo("돌고래", 8, "바다");
		
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
	}

}
