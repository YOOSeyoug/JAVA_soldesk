package chapter07;

public class Bank_02 {
	
	private String point; //������
	private String tel; //��ȭ��ȣ
	static float interest; //��������
	
	public Bank_02(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	public Bank_02() {
		// TODO Auto-generated constructor stub
	}
	
	//��� ��� �޼���
	public void getBank() {
		System.out.println("����: "+point+"\n"+"��ȭ��ȣ: "+tel+"\n��������: "+interest);
	}
	
	
	

}
