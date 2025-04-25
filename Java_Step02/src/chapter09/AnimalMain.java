package chapter09;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animalSound(dog);
		animalSound(cat);
		
	}
	
	public static void animalSound(Animal animal) {
		
		System.out.println("Á¾·ù: "+animal.kind);
		animal.sound();
		animal.breathe();
		System.out.println();
	}
	
	

}
