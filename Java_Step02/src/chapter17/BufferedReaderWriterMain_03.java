package chapter17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterMain_03 {

	public static void main(String[] args) {
		
		String filePath = "buffered_output.txt";
		String[] data = {"Hello, world!", "This is a test.", "Java I/O is interesting!"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			
			for(String line:data) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
		//BufferedReader�� ���� �б�
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			String line;
			System.out.println("���� ����");
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
