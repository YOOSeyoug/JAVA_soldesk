package chapter16;

public class ExceptionMain_02 {

	public static void main(String[] args) {
		
		int var=50;
		int data=0;
		
		try {
			System.out.println(var / data);
		} catch (NumberFormatException | ArithmeticException nae) {
			System.out.println("0�� �ƴ� ���ڷθ� �Է��ϼ���.");
		}catch (Exception e) {
			System.out.println("���� ó��");
		}
		System.out.println("program end");		

	}

}
