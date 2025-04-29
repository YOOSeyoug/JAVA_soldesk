package chapter14.stack;

import java.util.ArrayList;

class MyStack{
	
	//�������
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	//�޼���
	public void push(String data) {
		arrayStack.add(data);
	}//push
	
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("������ ��� �ֽ��ϴ�.");
			return null;
		}
		
		return(arrayStack.remove(len - 1));
		
	}//pop

	@Override
	public String toString() {
		return arrayStack.toString();
	}
	
	
	
	
}//class




public class StackTest_02 {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		//ArrayList
		System.out.println(stack.toString());
		
		//pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//��� ������ ��� �����Ǿ� �ڷ� ����
		System.out.println(stack.toString());

	}

}
