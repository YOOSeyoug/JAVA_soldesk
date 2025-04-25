package chapter12.wrapper;

public class IntegerMain_01 {

	public static void main(String[] args) {

		//Integer: 참조형 | int: 기본형(함수 없이 정수로 사용)
		Integer i = new Integer(100); //int i=100;
		//Integer 안의 메서드를 사용해야 하거나, 전화번호 등이 String으로 들어왔을 때 Integer사용
		
		Integer num = 100; //오토박싱 -> 일반 자료를 클래스로 선언(참조형 변수)
		
		int iNum = num.intValue(); //언박싱 ->클래스 형 자료를 일반형으로 -> (참조형 -> 일반형)
		
		int jNum = 200;
		
		//언박싱(Integer -> int)
		int sum=iNum+jNum;
		int total = num.intValue() + jNum;
		System.out.println(sum);
		System.out.println(total);
		
		//오토박싱(int -> integer)
		Integer x = jNum;
		Integer y = Integer.valueOf(jNum);
		System.out.println(x);
		System.out.println(y);
		
		
		

	}

}
