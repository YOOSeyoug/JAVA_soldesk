package chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain_08 {

	public static void main(String[] args) {
		//������ ����
		String sourceFilePath = "source01.txt";
		//���� ���� ������ ����
		String destFilePathWithoutBuffer = "dest_without_buffer.txt";
		//���۸� ����Ͽ� ������ ����
		String destFilePathWithBuffer = "dest_with_buffer.txt";

		//���� ���� ���� �ڵ�(10MB�� ������ ����)
		createTestFile(sourceFilePath, 1024*1024*10); //10MB
		
		//���۸� ������� �ʰ� ���� ����
		long startTime = System.nanoTime(); //���� ����
		copyWithoutBuffer(sourceFilePath, destFilePathWithoutBuffer);
		long endTime = System.nanoTime(); //���� ��
		long durationWithOutBuffer = endTime - startTime;
		System.out.println("���� ������� �ʰ� ���� �� �ҿ� �ð�: "+durationWithOutBuffer/1_000_000+"ms");
		
		//���۸� ����Ͽ� ���� ����
		startTime = System.nanoTime(); //���� ����
		copyWithoutBuffer(sourceFilePath, destFilePathWithBuffer);
		endTime = System.nanoTime(); //���� ��
		long durationWithBuffer = endTime - startTime;
		System.out.println("���� ����Ͽ� ���� �� �ҿ� �ð�: "+durationWithBuffer/1_000_000+"ms");
		
		
	}//main
	//���� ���� ����
	public static void createTestFile(String filePath, int sizeInBytes) {
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
			
			byte[] data = new byte[sizeInBytes];
			bos.write(data);
			
		} catch (Exception e) {
			System.out.println("���� ���� �� ���� �߻�: "+e.getMessage());
		}
		
	}//createTestFile
	
	//���� ���� ����
	public static void copyWithoutBuffer(String source, String dest) {
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream((dest))) {

			// BufferedInputStream ���� �뷮���� ����
			byte[] buffer = new byte[1024]; // 1KB ����
			int bytesData;
			// ���� ���Ͽ��� �����͸� �о� ���� ���Ͽ� ����
			while ((bytesData = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesData);
			}
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.err.println("���� ���� �� ���� �߻�: "+e.getMessage());
		}
	}//copyWithoutBuffer
	
	//���� ����Ͽ� ����
	public static void copyWithBuffer(String source, String dest) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

			// BufferedInputStream ���� �뷮���� ����
			byte[] buffer = new byte[1024]; // 1KB ����
			int bytesData;
			// ���� ���Ͽ��� �����͸� �о� ���� ���Ͽ� ����
			while ((bytesData = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesData);
			}
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.err.println("���� ���� �� ���� �߻�: "+e.getMessage());
		}
			
	}//copyWithBuffer

}
