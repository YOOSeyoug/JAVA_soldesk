package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamMain_05 {

	public static void main(String[] args) {
		// ���� ��� ����
		String filePath = "outputstream.txt";
		

		//FileOutputStream:������ ����
		try(FileInputStream fis = new FileInputStream(filePath)) {
			
			int byteData;
			System.out.println("���� ����");
			
			while((byteData = fis.read()) != -1) {
				System.out.print((char)byteData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
			System.out.println("���� �д� ���� ���� �߻�: "+e.getMessage());
		}
		
		
	}

}
