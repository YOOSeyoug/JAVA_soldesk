package chapter14.stack;

import java.util.ArrayList;

class MyStack{
	
	//멤버변수
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	//메서드
	public void push(String data) {
		arrayStack.add(data);
	}//push
	
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비어 있습니다.");
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
		
		//출력 데이터 모두 삭제되어 자료 없음
		System.out.println(stack.toString());

	}

}
