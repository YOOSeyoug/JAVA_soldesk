package chapter12.string;

public class StringObjectMain_02 {

	public static void main(String[] args) {
		
		StringObject v1 = new StringObject();
		v1.setVlaue(v1);
		
		System.out.println(v1.getVlaue());
		
		//------------------------------------
		StringObject v2 = new StringObject();
		v2.setVlaue(100); //현재 AutoBoxing -> 현재 객체화(Object)
		//Integer v2 = new Integer(100);
		System.out.println(v2.getVlaue());
		
		//캐스팅
		int i = (int) v2.getVlaue(); //unBoxing
		System.out.println(i+2);
		
		
		

	}

}
