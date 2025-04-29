package chapter13;

public class GenericContainerMain {

	public static void main(String[] args) {
		//문자열 아이템을 저장하는 객체
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		stringContainer.printItems();
		
		//타입제한으로 사용 불가능
		//String[] StringArray = {"1","2","3","4","5"};
		//stringContainer.sum(stringArray);
		
		GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(4);
		integerContainer.addItem(5);
		integerContainer.addItem(3);
		integerContainer.addItem(1);
		integerContainer.addItem(9);
		integerContainer.printItems();
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		System.out.println("Sum of int array: "+integerContainer.sum(intArray));
		
		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);
		doubleContainer.addItem(2.3);
		doubleContainer.addItem(20.1);
		doubleContainer.addItem(9.3);
		doubleContainer.addItem(12.5);
		doubleContainer.printItems();
		
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println("Double of int array: "+doubleContainer.sum(doubleArray));
		
		
		

	}

}
