package chapter12.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		String strNow1=now.toString();//now(heap�� �ִ� ��ü -> string Ÿ������ ��ȯ)
		System.out.println("------DATE------");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println("------SimpleDateFormat------");
		System.out.println(strNow2);
		
		

	}

}
