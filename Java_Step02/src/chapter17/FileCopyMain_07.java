package chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain_07 {

	public static void main(String[] args) {
		
		// ���� �� ���� ���� ��� ����
		String sourceFile = "IOStream.txt";
		String destFile = "copy.txt";
		
		//BufferedInputStream���� �о�鿩�� BufferedOutputStream���� �����ؼ� ����
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile)); //��������
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) { //����
			
			byte[] buffer = new byte[1024]; //1KB ����
			int bytesRead;
			
			//���� ���Ͽ��� �����͸� �о� ���� ���Ͽ� ����
			while((bytesRead=bis.read(buffer)) != -1) {
				//1024KB�� 0���� �����ؼ� ���� ���� ���Ͽ� ����
				bos.write(buffer, 0, bytesRead);
			}//while
			System.out.println("������ ���������� ���� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� ���� ���� ���� �߻�: "+e.getMessage());
		}
		

	}

}
