package chapter16;

public class ExceptionMain_02 {

	public static void main(String[] args) {
		
		int var=50;
		int data=0;
		
		try {
			System.out.println(var / data);
		} catch (NumberFormatException | ArithmeticException nae) {
			System.out.println("0이 아닌 숫자로만 입력하세요.");
		}catch (Exception e) {
			System.out.println("예외 처리");
		}
		System.out.println("program end");		

	}

}
