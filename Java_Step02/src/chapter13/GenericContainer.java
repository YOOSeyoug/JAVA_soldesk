package chapter13;

public class GenericContainer<T> {
	
	private T[] items; //int[] i;
	private int count;
	
	//기본생성자 생략
	
	public GenericContainer(int size) {
		items = (T[])new Object[size];
		count = 0;
		
	}
	
	//아이템을 추가하는 제네릭 메서드
	public void addItem(T item) {
		
		if (count < items.length) {
			//items[count] = item;
			//count++;
			items[count++] = item;
		}else {
			System.out.println("Container is full");
		}
	}//additem
	
	public void printItems() {
		for(int i = 0; i < count; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();
	}
	
	//E extends Number : 숫자 타입만 호환
	public <E extends Number> double sum(E[] numbers) {
		double total = 0;
		for(E number:numbers) {
			total += number.doubleValue();
		}
		return total;
	}

}
