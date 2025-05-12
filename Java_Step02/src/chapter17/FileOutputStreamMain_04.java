package chapter17;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain_04 {

	public static void main(String[] args) {
		// ���� ��� ����
		String filePath = "outputstream.txt";
		String data = "Hello, this is a test of FileOutputStream.";

		//FileOutputStream:������ ����
		try(FileOutputStream fos = new FileOutputStream(filePath)) {
			//���ڿ� �����͸� ����Ʈ �迭�� ��ȯ�Ͽ� ���Ͽ� ����
			fos.write(data.getBytes());
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
			
			System.out.println("���� ���� ���� ���� �߻�: "+e.getMessage());
		}
		
		
	}

}
