package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamMain_06 {

	public static void main(String[] args) {
		//FileIOStream: 1byte -> ���ڵ�("UTF-8")
		//FileInputStream(����Ʈ ������ �б�), FileOutputStream(����Ʈ ������ ����)
		// �̹���, �����, ���� ���� ������ ���̳ʸ� �ڵ�� ��ȯ�Ͽ� �Է� �Ǵ� ���
		
		String data = "Hello, this is a test of" + " FileInputStream and FileOutputStream.";
		String filePath = "IOStream.txt";
		
		//FileOutputStream�� ����Ͽ� ���Ͽ� ������ ����
		try(FileOutputStream fos = new FileOutputStream(filePath)) {
			
			fos.write(data.getBytes()); //1byte�� ���Ƿ� ���ڵ��� �ʿ�
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    //-------------------------------------------------------------
		
		//FileInputStream�� ����Ͽ� ���Ͽ� ������ �б�
		try(FileInputStream fis = new FileInputStream(filePath)) {
			
			int content;
			System.out.println("---���� ������---");
			while((content = fis.read()) != -1) {
				System.out.print((char)content);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}
