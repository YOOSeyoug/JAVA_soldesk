package chapter07;

import java.util.Scanner;

public class Guide_04 {
	
	//�������
	static String point;
	Guest[] guest;
	Scanner scan;
	
	//������
	public Guide_04(int n) {
		//������
		point="�߸�";
		//������ �� ��ŭ �޸� Ȯ��
		guest = new Guest[n];
		
		for(int i=0; i<n; i++) {
			guest[i]=new Guest();
		}//for
		
	}//������
	
	//�޼���
	public static String getpoint() {
		return point;
	}
	

}
