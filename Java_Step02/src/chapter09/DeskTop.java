package chapter09;

public class DeskTop extends Computer {

	//�߻� Ŭ������ ��� ������ �߻� �޼���� �ݵ�� �����ؾ� �Ѵ�.
	@Override
	public void display() {
		System.out.println("DeskTop Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}

}
