package Test02_Java2.AnimalClass;

public class Bird extends Animal{
	
	public Bird(String name) {
		super(name);
	}
	
	public void makeSound() {
		System.out.println(name+": ±±!");
	}

}
