package chapter18.lambda;

@FunctionalInterface
interface MyFunctionInterface{
	
	void showMsg(String message);
	
}

public class LambdaMain_03 {

	public static void main(String[] args) {
		
		//���ٽ� ����
		MyFunctionInterface f = s -> System.out.println(s);
		//#1
		f.showMsg("���ٽ� ����");
		
		//#2 �Ű����� ���ٽ�
		showMyMsg(f);

	}
	//=========================================
	public static void showMyMsg(MyFunctionInterface f) {
		
		f.showMsg("�Ű� ������ ���Ǵ� ���ٽ�");
		
	}

}
