package chapter20;

class Counter {
	
	private int count = 0;
	
	synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
	
}

public class Thread_04 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Runnable task=() -> {
			for(int i=0; i<1000; i++) {
				counter.increment();
			}
		};
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); // 스레드 작업이 끝날 때까지 기다림
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(counter.getCount());

	}

}
