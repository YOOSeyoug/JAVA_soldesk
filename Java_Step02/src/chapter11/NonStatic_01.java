package chapter11;

import javax.swing.JOptionPane;

class Out{
	
	//�������
	static int a=1;
	
	//������
	
	//�޼���
	
	//���� Ŭ����
	public class In{
		
		//�������
		
		//������
		
		//�޼���
		public String Infun() {
			
			return a+"��° Non-Static ����";
		}
		
	}//in class
	
	
}//out class

public class NonStatic_01 {
	
	public static void main(String[] args) {
		
		//#1 Out class ��ü
		Out obj1 = new Out();
		//#2 in class ��ü
		Out.In obj2 = obj1.new In();
		String str = obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\nSuccess");
		
		
	}

}
